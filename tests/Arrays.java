public class Arrays {

    public static class Day {
        public int day;
        public Day() { }
        public Day(int d) { this.day = d; }
        public int getDay() { return day; }
        public void setDay(int d) { this.day = d; }
    }

    public void foo() {
        /*readonly*/ Day[/*mutable*/] ma = new Day[1];
        /*readonly*/ Day d = new Day();
        ma[0] = d;
        /*readonly*/ Day x = ma[0];
        int y = x.getDay();
    }

    public void bar() {
        /*mutable*/ Day[/*mutable*/] ma = new Day[1];
        /*mutable*/ Day d = new Day();
        ma[0] = d;
        /*mutable*/ Day x = ma[0];
        int y = x.getDay();
        x.setDay(y);
    }

    public void baz() {
        /*mutable*/ Day[/*mutable*/] ma = new Day[1];
        ma[0] = new Day();
        ma[0].setDay(2);

        /*? readonly*/ Day[/*readonly*/] ra = ma;
        /*readonly*/ Day x = ra[0];
        int y = x.getDay();

     }


    public void quax() {
        /*mutable*/ Day[/*mutable*/] ma = new Day[1];
        /*mutable*/ Day d = new Day();
        ma[0] = d;

        /*mutable*/ Day[/*readonly*/] ra = ma;
        /*mutable*/ Day x = ra[0];
        int y = x.getDay();
        x.setDay(y);
    }
}
