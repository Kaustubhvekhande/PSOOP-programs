class Date {
	int year, month, hour, min, sec, date;

	Date() { // constructor without parameters
		this.year = 2000;
		this.month = 1;
		this.date = 1;
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}

	Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	Date(int year, int month, int date, int hours, int min) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hours;
		this.min = min;
	}

	Date(int year, int month, int date, int hours, int min, int sec) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hours;
		this.min = min;
		this.sec = sec;
	}

	String[] months = { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	void displayDate() {
		System.out.printf("Date: %02d/%s/%04d\n", date, months[month - 1], year);
		if (hour != 0 || min != 0 || sec != 0) {
			System.out.printf("Time: %02d:%02d:%02d", hour, min, sec);
		} else if (hour != 0 || min != 0) {
			System.out.printf("Time: %02d:%02d", hour, min);
		}
	}

}
