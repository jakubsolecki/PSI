import java.util.LinkedList;
import JSHOP2.*;

public class problem
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[58];

		problemConstants[0] = "plane1";
		problemConstants[1] = "loc1-1";
		problemConstants[2] = "plane2";
		problemConstants[3] = "loc4-1";
		problemConstants[4] = "plane3";
		problemConstants[5] = "loc5-1";
		problemConstants[6] = "truck1-1";
		problemConstants[7] = "city1";
		problemConstants[8] = "loc1-2";
		problemConstants[9] = "loc1-3";
		problemConstants[10] = "loc2-1";
		problemConstants[11] = "truck2-1";
		problemConstants[12] = "city2";
		problemConstants[13] = "loc2-2";
		problemConstants[14] = "loc2-3";
		problemConstants[15] = "loc3-1";
		problemConstants[16] = "truck3-1";
		problemConstants[17] = "city3";
		problemConstants[18] = "loc3-2";
		problemConstants[19] = "loc3-3";
		problemConstants[20] = "truck4-1";
		problemConstants[21] = "city4";
		problemConstants[22] = "loc4-2";
		problemConstants[23] = "loc4-3";
		problemConstants[24] = "truck5-1";
		problemConstants[25] = "city5";
		problemConstants[26] = "loc5-2";
		problemConstants[27] = "loc5-3";
		problemConstants[28] = "loc6-1";
		problemConstants[29] = "truck6-1";
		problemConstants[30] = "city6";
		problemConstants[31] = "loc6-2";
		problemConstants[32] = "loc6-3";
		problemConstants[33] = "loc7-1";
		problemConstants[34] = "truck7-1";
		problemConstants[35] = "city7";
		problemConstants[36] = "loc7-2";
		problemConstants[37] = "loc7-3";
		problemConstants[38] = "loc8-1";
		problemConstants[39] = "truck8-1";
		problemConstants[40] = "city8";
		problemConstants[41] = "loc8-2";
		problemConstants[42] = "loc8-3";
		problemConstants[43] = "package1";
		problemConstants[44] = "package2";
		problemConstants[45] = "package3";
		problemConstants[46] = "package4";
		problemConstants[47] = "package5";
		problemConstants[48] = "package6";
		problemConstants[49] = "package7";
		problemConstants[50] = "package8";
		problemConstants[51] = "package9";
		problemConstants[52] = "package10";
		problemConstants[53] = "package11";
		problemConstants[54] = "package12";
		problemConstants[55] = "package13";
		problemConstants[56] = "package14";
		problemConstants[57] = "package15";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(4, 0, new TermList(TermConstant.getConstant(11), new TermList(TermConstant.getConstant(12), TermList.NIL))));
		s.add(new Predicate(4, 0, new TermList(TermConstant.getConstant(13), new TermList(TermConstant.getConstant(14), TermList.NIL))));
		s.add(new Predicate(4, 0, new TermList(TermConstant.getConstant(15), new TermList(TermConstant.getConstant(16), TermList.NIL))));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(12), TermList.NIL)));
		s.add(new Predicate(7, 0, new TermList(TermConstant.getConstant(17), new TermList(TermConstant.getConstant(18), TermList.NIL))));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(17), new TermList(TermConstant.getConstant(12), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(12), new TermList(TermConstant.getConstant(18), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(19), new TermList(TermConstant.getConstant(18), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(20), new TermList(TermConstant.getConstant(18), TermList.NIL))));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(21), TermList.NIL)));
		s.add(new Predicate(7, 0, new TermList(TermConstant.getConstant(22), new TermList(TermConstant.getConstant(23), TermList.NIL))));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(22), new TermList(TermConstant.getConstant(21), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(21), new TermList(TermConstant.getConstant(23), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(24), new TermList(TermConstant.getConstant(23), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(25), new TermList(TermConstant.getConstant(23), TermList.NIL))));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(26), TermList.NIL)));
		s.add(new Predicate(7, 0, new TermList(TermConstant.getConstant(27), new TermList(TermConstant.getConstant(28), TermList.NIL))));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(27), new TermList(TermConstant.getConstant(26), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(26), new TermList(TermConstant.getConstant(28), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(29), new TermList(TermConstant.getConstant(28), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(30), new TermList(TermConstant.getConstant(28), TermList.NIL))));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(14), TermList.NIL)));
		s.add(new Predicate(7, 0, new TermList(TermConstant.getConstant(31), new TermList(TermConstant.getConstant(32), TermList.NIL))));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(31), new TermList(TermConstant.getConstant(14), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(14), new TermList(TermConstant.getConstant(32), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(33), new TermList(TermConstant.getConstant(32), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(34), new TermList(TermConstant.getConstant(32), TermList.NIL))));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(16), TermList.NIL)));
		s.add(new Predicate(7, 0, new TermList(TermConstant.getConstant(35), new TermList(TermConstant.getConstant(36), TermList.NIL))));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(35), new TermList(TermConstant.getConstant(16), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(16), new TermList(TermConstant.getConstant(36), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(37), new TermList(TermConstant.getConstant(36), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(38), new TermList(TermConstant.getConstant(36), TermList.NIL))));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(39), TermList.NIL)));
		s.add(new Predicate(7, 0, new TermList(TermConstant.getConstant(40), new TermList(TermConstant.getConstant(41), TermList.NIL))));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(40), new TermList(TermConstant.getConstant(39), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(39), new TermList(TermConstant.getConstant(41), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(42), new TermList(TermConstant.getConstant(41), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(43), new TermList(TermConstant.getConstant(41), TermList.NIL))));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(44), TermList.NIL)));
		s.add(new Predicate(7, 0, new TermList(TermConstant.getConstant(45), new TermList(TermConstant.getConstant(46), TermList.NIL))));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(45), new TermList(TermConstant.getConstant(44), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(44), new TermList(TermConstant.getConstant(46), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(47), new TermList(TermConstant.getConstant(46), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(48), new TermList(TermConstant.getConstant(46), TermList.NIL))));
		s.add(new Predicate(9, 0, new TermList(TermConstant.getConstant(49), TermList.NIL)));
		s.add(new Predicate(7, 0, new TermList(TermConstant.getConstant(50), new TermList(TermConstant.getConstant(51), TermList.NIL))));
		s.add(new Predicate(2, 0, new TermList(TermConstant.getConstant(50), new TermList(TermConstant.getConstant(49), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(49), new TermList(TermConstant.getConstant(51), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(52), new TermList(TermConstant.getConstant(51), TermList.NIL))));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(53), new TermList(TermConstant.getConstant(51), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(54), new TermList(TermConstant.getConstant(53), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(55), new TermList(TermConstant.getConstant(12), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(56), new TermList(TermConstant.getConstant(24), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(57), new TermList(TermConstant.getConstant(43), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(58), new TermList(TermConstant.getConstant(16), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(59), new TermList(TermConstant.getConstant(25), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(60), new TermList(TermConstant.getConstant(19), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(61), new TermList(TermConstant.getConstant(43), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(62), new TermList(TermConstant.getConstant(37), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(63), new TermList(TermConstant.getConstant(44), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(64), new TermList(TermConstant.getConstant(25), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(65), new TermList(TermConstant.getConstant(24), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(66), new TermList(TermConstant.getConstant(47), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(67), new TermList(TermConstant.getConstant(44), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(68), new TermList(TermConstant.getConstant(52), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(54), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(55), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(56), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(57), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(58), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(59), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(60), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(61), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(62), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(63), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(64), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(65), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(66), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(67), new TermList(new TermNumber(0.0), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(68), new TermList(new TermNumber(0.0), TermList.NIL))));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(69);

		Domain d = new logistics();

		d.setProblemConstants(defineConstants());

		State s = new State(11, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(15, false);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(54), new TermList(TermConstant.getConstant(49), TermList.NIL))), false, false));
		tl.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(55), new TermList(TermConstant.getConstant(21), TermList.NIL))), false, false));
		tl.subtasks[2] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(56), new TermList(TermConstant.getConstant(25), TermList.NIL))), false, false));
		tl.subtasks[3] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(57), new TermList(TermConstant.getConstant(42), TermList.NIL))), false, false));
		tl.subtasks[4] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(58), new TermList(TermConstant.getConstant(12), TermList.NIL))), false, false));
		tl.subtasks[5] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(59), new TermList(TermConstant.getConstant(42), TermList.NIL))), false, false));
		tl.subtasks[6] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(60), new TermList(TermConstant.getConstant(43), TermList.NIL))), false, false));
		tl.subtasks[7] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(61), new TermList(TermConstant.getConstant(12), TermList.NIL))), false, false));
		tl.subtasks[8] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(62), new TermList(TermConstant.getConstant(33), TermList.NIL))), false, false));
		tl.subtasks[9] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(63), new TermList(TermConstant.getConstant(53), TermList.NIL))), false, false));
		tl.subtasks[10] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(64), new TermList(TermConstant.getConstant(29), TermList.NIL))), false, false));
		tl.subtasks[11] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(65), new TermList(TermConstant.getConstant(30), TermList.NIL))), false, false));
		tl.subtasks[12] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(66), new TermList(TermConstant.getConstant(29), TermList.NIL))), false, false));
		tl.subtasks[13] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(67), new TermList(TermConstant.getConstant(43), TermList.NIL))), false, false));
		tl.subtasks[14] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(TermConstant.getConstant(68), new TermList(TermConstant.getConstant(16), TermList.NIL))), false, false));

		thread = new SolverThread(tl, 1);
		thread.start();

		try {
			while (thread.isAlive())
				Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		returnedPlans.addAll( thread.getPlans() );

		return returnedPlans;
	}

	public static LinkedList<Predicate> getFirstPlanOps() {
		return getPlans().getFirst().getOps();
	}
}