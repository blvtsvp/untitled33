package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Calendar {

        int month, number;

    public Calendar(int month, int number) {
        this.month = month;
        this.number = number;
    }

    public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }
        public String DescriptionHoliday(){
            return "Это праздничная дата "+this.number+"."+this.month;
        }

    public static class weekends extends Calendar{

        public weekends(int month, int number) {
            super(month, number);
        }

        public String DescriptionWeek() {
            return "Это выходной " + this.number + "." + this.month;
        }

    }

    public static void main(String[] args) {

        Calendar date1 = new Calendar(1,10);
        weekends date2 = new weekends(1,1);
        System.out.println(date1.DescriptionHoliday());
        System.out.println(date2.DescriptionWeek());

    }
}
