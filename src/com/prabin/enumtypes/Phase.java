package com.prabin.enumtypes;

import java.util.EnumMap;
import java.util.Map;

public enum Phase {
	SOLID, LIQUID, GAS, PLASMA;
	
	public enum Transition {
		MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS), 
		CONDENSE(GAS, LIQUID), SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID),
		IONIZE(GAS, PLASMA), DEIONIZE(PLASMA, GAS);
		
		private final Phase src;
		private final Phase dest;
		
		Transition(Phase src, Phase dest) {
			this.src = src;
			this.dest = dest;
		}
		
		//Initialize the phase transition map
		private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<Phase, Map<Phase, Transition>>(Phase.class);
		
		static {
			for(Phase p : Phase.values()) {
				m.put(p, new EnumMap<Phase, Transition>(Phase.class));
			}
			for(Transition trans : Transition.values()) {
				m.get(trans.src).put(trans.dest, trans);
			}
		}
		
		public static void main(String... args) {
			for(Phase src : Phase.values()) {
				for(Phase dest: Phase.values()) {
					Transition from = Transition.from(src, dest);
					if(src != dest && from != null) {
						System.out.printf("%s to %s : %s %n", src, dest, from);
					}
				}
			}
		}

		private static Transition from(Phase src2, Phase dest2) {
			return m.get(src2).get(dest2);
		}
	}

}
