import javax.sound.midi.Soundbank;

public class Printer {
	private int tonerLevel;
	private int numberOfPages;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}
		this.numberOfPages = 0;
		this.duplex = duplex;
	}

	public int filltoner(int toneramount) {
		if (tonerLevel > 0 && toneramount <= 100) {
			if (this.tonerLevel + toneramount > 100)
				return -1;

			this.tonerLevel += toneramount;
			return this.tonerLevel;
		} else {
			return -1;
		}

	}

	public int printing(int pages) {
		int pagestoprint = pages;
		if (duplex == true) {
			// half of the number coz the printer print on both sides:
			pagestoprint /= 2;
			System.out.println("Print Duplex " + pagestoprint + " pages");
		} else {
			System.out.println("Print not Dublex "+pagestoprint+" pages");
			this.numberOfPages += pagestoprint;

			return pagestoprint;
		}
		return pagestoprint;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

}
