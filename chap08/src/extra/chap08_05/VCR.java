package extra.chap08_05;

public class VCR implements IVCR {
	protected int counter;

	@Override
	public void play() { /*Tape�� ����Ѵ�*/
		
	}

	@Override
	public void stop() { /*����� �����*/
		
	}

	@Override
	public void reset() { counter=0;
		
	}

	@Override
	public int getCounter() { return counter;
	}

	@Override
	public void setCounter(int c) { counter = c;
		
	}

}
