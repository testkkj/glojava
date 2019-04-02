package extra.chap08_05;

public class VCR implements IVCR {
	protected int counter;

	@Override
	public void play() { /*Tape을 재생한다*/
		
	}

	@Override
	public void stop() { /*재생을 멈춘다*/
		
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
