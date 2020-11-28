import JSHOP2.*;

class Operator0 extends Operator
{
	public Operator0()
	{
		super(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[3];
		delIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		delIn[1] = new DelAddProtection(new Predicate(2, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		delIn[2] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(3, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(new TermCall(new List(TermVariable.getVariable(3), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator1 extends Operator
{
	public Operator1()
	{
		super(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[3];
		delIn[0] = new DelAddAtomic(new Predicate(3, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		delIn[1] = new DelAddProtection(new Predicate(2, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		delIn[2] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(new TermCall(new List(TermVariable.getVariable(3), new TermList(new TermNumber(1.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator2 extends Operator
{
	public Operator2()
	{
		super(new Predicate(2, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[3];
		delIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		delIn[1] = new DelAddProtection(new Predicate(4, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		delIn[2] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(new TermCall(new List(TermVariable.getVariable(3), new TermList(new TermNumber(3.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator3 extends Operator
{
	public Operator3()
	{
		super(new Predicate(3, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[3];
		delIn[0] = new DelAddAtomic(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		delIn[1] = new DelAddProtection(new Predicate(4, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		delIn[2] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(new TermCall(new List(TermVariable.getVariable(3), new TermList(new TermNumber(3.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator4 extends Operator
{
	public Operator4()
	{
		super(new Predicate(4, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(2, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		delIn[1] = new DelAddAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[3];
		addIn[0] = new DelAddAtomic(new Predicate(2, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		addIn[1] = new DelAddProtection(new Predicate(2, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		addIn[2] = new DelAddAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(3), new TermList(new TermCall(new List(TermVariable.getVariable(4), new TermList(new TermNumber(10.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator5 extends Operator
{
	public Operator5()
	{
		super(new Predicate(5, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(4, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		delIn[1] = new DelAddAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[3];
		addIn[0] = new DelAddAtomic(new Predicate(4, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		addIn[1] = new DelAddProtection(new Predicate(4, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));
		addIn[2] = new DelAddAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(3), new TermList(new TermCall(new List(TermVariable.getVariable(4), new TermList(new TermNumber(100.0), TermList.NIL)), StdLib.plus, "StdLib.plus"), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator6 extends Operator
{
	public Operator6()
	{
		super(new Predicate(6, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddProtection(new Predicate(0, 1));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(1)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator7 extends Operator
{
	public Operator7()
	{
		super(new Predicate(7, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddProtection(new Predicate(0, 1));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(1)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition0 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition0(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(1, 10, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(7, 10, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Precondition1 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition1(Term[] unifier)
	{
		p = new Precondition[11];
		p[1] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(1, 10, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(8, 10, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[5] = new PreconditionAtomic(new Predicate(7, 10, new TermList(TermVariable.getVariable(6), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[6] = new PreconditionAtomic(new Predicate(7, 10, new TermList(TermVariable.getVariable(7), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[7] = new PreconditionAtomic(new Predicate(9, 10, new TermList(TermVariable.getVariable(8), TermList.NIL)), unifier);
		p[8] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(8), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[9] = new PreconditionAtomic(new Predicate(9, 10, new TermList(TermVariable.getVariable(9), TermList.NIL)), unifier);
		p[10] = new PreconditionAtomic(new Predicate(6, 10, new TermList(TermVariable.getVariable(9), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		b = new Term[11][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[10] == null)
		{
			boolean b9changed = false;
			while (b[9] == null)
			{
				boolean b8changed = false;
				while (b[8] == null)
				{
					boolean b7changed = false;
					while (b[7] == null)
					{
						boolean b6changed = false;
						while (b[6] == null)
						{
							boolean b5changed = false;
							while (b[5] == null)
							{
								boolean b4changed = false;
								while (b[4] == null)
								{
									boolean b3changed = false;
									while (b[3] == null)
									{
										boolean b2changed = false;
										while (b[2] == null)
										{
											boolean b1changed = false;
											while (b[1] == null)
											{
												b[1] = p[1].nextBinding();
												if (b[1] == null)
													return null;
												b1changed = true;
											}
											if ( b1changed ) {
												p[2].reset();
												p[2].bind(Term.merge(b, 2));
											}
											b[2] = p[2].nextBinding();
											if (b[2] == null) b[1] = null;
											b2changed = true;
										}
										if ( b2changed ) {
											p[3].reset();
											p[3].bind(Term.merge(b, 3));
										}
										b[3] = p[3].nextBinding();
										if (b[3] == null) b[2] = null;
										b3changed = true;
									}
									if ( b3changed ) {
										p[4].reset();
										p[4].bind(Term.merge(b, 4));
									}
									b[4] = p[4].nextBinding();
									if (b[4] == null) b[3] = null;
									b4changed = true;
								}
								if ( b4changed ) {
									p[5].reset();
									p[5].bind(Term.merge(b, 5));
								}
								b[5] = p[5].nextBinding();
								if (b[5] == null) b[4] = null;
								b5changed = true;
							}
							if ( b5changed ) {
								p[6].reset();
								p[6].bind(Term.merge(b, 6));
							}
							b[6] = p[6].nextBinding();
							if (b[6] == null) b[5] = null;
							b6changed = true;
						}
						if ( b6changed ) {
							p[7].reset();
							p[7].bind(Term.merge(b, 7));
						}
						b[7] = p[7].nextBinding();
						if (b[7] == null) b[6] = null;
						b7changed = true;
					}
					if ( b7changed ) {
						p[8].reset();
						p[8].bind(Term.merge(b, 8));
					}
					b[8] = p[8].nextBinding();
					if (b[8] == null) b[7] = null;
					b8changed = true;
				}
				if ( b8changed ) {
					p[9].reset();
					p[9].bind(Term.merge(b, 9));
				}
				b[9] = p[9].nextBinding();
				if (b[9] == null) b[8] = null;
				b9changed = true;
			}
			if ( b9changed ) {
				p[10].reset();
				p[10].bind(Term.merge(b, 10));
			}
			b[10] = p[10].nextBinding();
			if (b[10] == null) b[9] = null;
		}

		Term[] retVal = Term.merge(b, 11);
		b[10] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		p[9].reset();
		p[10].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
	}
}

class Method0 extends Method
{
	public Method0()
	{
		super(new Predicate(2, 10, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))))), false, false));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(3, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(TermVariable.getVariable(6), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(8), TermList.NIL))))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 10, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(8), new TermList(TermVariable.getVariable(9), TermList.NIL)))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(0, 10, new TermList(TermVariable.getVariable(7), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(9), new TermList(TermVariable.getVariable(1), TermList.NIL))))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition0(unifier)).setComparator(null);
			break;
			case 1:
				p = (new Precondition1(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method0Branch0";
			case 1: return "Method0Branch1";
			default: return null;
		}
	}
}

class Precondition2 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition2(Term[] unifier)
	{
		p = new Precondition[3];
		p[1] = new PreconditionAtomic(new Predicate(6, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(7, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		b = new Term[3][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[2] == null)
		{
			boolean b1changed = false;
			while (b[1] == null)
			{
				b[1] = p[1].nextBinding();
				if (b[1] == null)
					return null;
				b1changed = true;
			}
			if ( b1changed ) {
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
			}
			b[2] = p[2].nextBinding();
			if (b[2] == null) b[1] = null;
		}

		Term[] retVal = Term.merge(b, 3);
		b[2] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		b[1] = null;
		b[2] = null;
	}
}

class Method1 extends Method
{
	public Method1()
	{
		super(new Predicate(0, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = TaskList.empty;
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 5, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL)))), true, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(1, 5, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL)))), true, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(10, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
				p = (new Precondition2(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method1Branch0";
			case 1: return "Method1Branch1";
			default: return null;
		}
	}
}

class Precondition3 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition3(Term[] unifier)
	{
		p = new Precondition[3];
		p[1] = new PreconditionAtomic(new Predicate(2, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(8, 4, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		b = new Term[3][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[2] == null)
		{
			boolean b1changed = false;
			while (b[1] == null)
			{
				b[1] = p[1].nextBinding();
				if (b[1] == null)
					return null;
				b1changed = true;
			}
			if ( b1changed ) {
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
			}
			b[2] = p[2].nextBinding();
			if (b[2] == null) b[1] = null;
		}

		Term[] retVal = Term.merge(b, 3);
		b[2] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		b[1] = null;
		b[2] = null;
	}
}

class Precondition4 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition4(Term[] unifier)
	{
		p = new Precondition[3];
		p[1] = new PreconditionAtomic(new Predicate(2, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(10, 4, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		b = new Term[3][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[2] == null)
		{
			boolean b1changed = false;
			while (b[1] == null)
			{
				b[1] = p[1].nextBinding();
				if (b[1] == null)
					return null;
				b1changed = true;
			}
			if ( b1changed ) {
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
			}
			b[2] = p[2].nextBinding();
			if (b[2] == null) b[1] = null;
		}

		Term[] retVal = Term.merge(b, 3);
		b[2] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		b[1] = null;
		b[2] = null;
	}
}

class Method2 extends Method
{
	public Method2()
	{
		super(new Predicate(3, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(4, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))))), true, true));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(6, 4, new TermList(new TermList(TermConstant.getConstant(2), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), TermList.NIL)), true, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition3(unifier)).setComparator(null);
			break;
			case 1:
				p = (new Precondition4(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method2Branch0";
			case 1: return "Method2Branch1";
			default: return null;
		}
	}
}

class Method3 extends Method
{
	public Method3()
	{
		super(new Predicate(1, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(6, 5, new TermList(new TermList(TermConstant.getConstant(4), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))), TermList.NIL)), true, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(4, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, true));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))))), true, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(4, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(4, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
				p = (new PreconditionAtomic(new Predicate(4, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "airplane-at-the-current-airport";
			case 1: return "Method3Branch1";
			default: return null;
		}
	}
}

class Method4 extends Method
{
	public Method4()
	{
		super(new Predicate(4, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(6, 4, new TermList(new TermList(TermConstant.getConstant(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), TermList.NIL)), true, true));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))))), true, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(4, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
				p = (new PreconditionAtomic(new Predicate(4, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "airplane-already-there";
			case 1: return "fly-airplane-in";
			default: return null;
		}
	}
}

class Axiom0 extends Axiom
{
	public Axiom0()
	{
		super(new Predicate(10, 1, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(0), TermList.NIL))), 1);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNil(1)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Axiom0Branch0";
			default: return null;
		}
	}
}

class Axiom1 extends Axiom
{
	public Axiom1()
	{
		super(new Predicate(8, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), 1);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(10, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier), 2)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Axiom1Branch0";
			default: return null;
		}
	}
}

public class logistics extends Domain
{
	public logistics()
	{
		TermVariable.initialize(10);

		constants = new String[11];
		constants[0] = "cost";
		constants[1] = "obj-at";
		constants[2] = "truck-at";
		constants[3] = "in-truck";
		constants[4] = "airplane-at";
		constants[5] = "in-airplane";
		constants[6] = "in-city";
		constants[7] = "truck";
		constants[8] = "different";
		constants[9] = "airport";
		constants[10] = "same";

		compoundTasks = new String[5];
		compoundTasks[0] = "in-city-delivery";
		compoundTasks[1] = "air-deliver-obj";
		compoundTasks[2] = "obj-at";
		compoundTasks[3] = "truck-at";
		compoundTasks[4] = "fly-airplane";

		primitiveTasks = new String[8];
		primitiveTasks[0] = "!load-truck";
		primitiveTasks[1] = "!unload-truck";
		primitiveTasks[2] = "!load-airplane";
		primitiveTasks[3] = "!unload-airplane";
		primitiveTasks[4] = "!drive-truck";
		primitiveTasks[5] = "!fly-airplane";
		primitiveTasks[6] = "!add-protection";
		primitiveTasks[7] = "!delete-protection";

		methods = new Method[5][];

		methods[0] = new Method[1];
		methods[0][0] = new Method1();

		methods[1] = new Method[1];
		methods[1][0] = new Method3();

		methods[2] = new Method[1];
		methods[2][0] = new Method0();

		methods[3] = new Method[1];
		methods[3][0] = new Method2();

		methods[4] = new Method[1];
		methods[4][0] = new Method4();


		ops = new Operator[8][];

		ops[0] = new Operator[1];
		ops[0][0] = new Operator0();

		ops[1] = new Operator[1];
		ops[1][0] = new Operator1();

		ops[2] = new Operator[1];
		ops[2][0] = new Operator2();

		ops[3] = new Operator[1];
		ops[3][0] = new Operator3();

		ops[4] = new Operator[1];
		ops[4][0] = new Operator4();

		ops[5] = new Operator[1];
		ops[5][0] = new Operator5();

		ops[6] = new Operator[1];
		ops[6][0] = new Operator6();

		ops[7] = new Operator[1];
		ops[7][0] = new Operator7();

		axioms = new Axiom[11][];

		axioms[0] = new Axiom[0];

		axioms[1] = new Axiom[0];

		axioms[2] = new Axiom[0];

		axioms[3] = new Axiom[0];

		axioms[4] = new Axiom[0];

		axioms[5] = new Axiom[0];

		axioms[6] = new Axiom[0];

		axioms[7] = new Axiom[0];

		axioms[8] = new Axiom[1];
		axioms[8][0] = new Axiom1();

		axioms[9] = new Axiom[0];

		axioms[10] = new Axiom[1];
		axioms[10][0] = new Axiom0();

	}
}