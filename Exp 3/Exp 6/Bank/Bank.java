import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

abstract class Bank {
    abstract float getROI(int days);

    double calculateAmount(double principal, float rate, int days) {
        double timeInYears = days / 365.0;
        return principal * Math.pow((1 + rate / 100.0), timeInYears);
    }

    Calendar calculateMaturityDate(int days) {
        Calendar today = Calendar.getInstance();
        today.add(Calendar.DAY_OF_YEAR, days);
        return today;
    }
}

class SBI_Bank extends Bank {
    @Override
    float getROI(int days) {
        if (days >= 7 && days <= 14)
            return 3.00f;
        else if (days >= 15 && days <= 30)
            return 3.00f;
        else if (days >= 31 && days <= 45)
            return 3.00f;
        else if (days >= 46 && days <= 90)
            return 4.05f;
        else if (days >= 91 && days <= 120)
            return 4.10f;
        else if (days >= 121 && days <= 180)
            return 4.10f;
        else
            return 2.0f;
    }
}

class ICICI_Bank extends Bank {
    @Override
    float getROI(int days) {
        if (days >= 7 && days <= 14)
            return 3.10f;
        else if (days >= 15 && days <= 30)
            return 3.20f;
        else if (days >= 31 && days <= 45)
            return 3.50f;
        else if (days >= 46 && days <= 90)
            return 4.50f;
        else if (days >= 91 && days <= 120)
            return 4.70f;
        else if (days >= 121 && days <= 180)
            return 4.90f;
        else
            return 2.0f;
    }
}

class AXIS_Bank extends Bank {
    @Override
    float getROI(int days) {
        if (days >= 7 && days <= 14)
            return 3.15f;
        else if (days >= 15 && days <= 30)
            return 3.15f;
        else if (days >= 31 && days <= 45)
            return 3.45f;
        else if (days >= 46 && days <= 90)
            return 4.05f;
        else if (days >= 91 && days <= 120)
            return 4.70f;
        else if (days >= 121 && days <= 180)
            return 5.00f;
        else
            return 2.0f;
    }
}
