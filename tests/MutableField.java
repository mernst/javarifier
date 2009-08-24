public class MutableField {

    // That commented @checkers.javari.quals.Mutable is recognized by the extended
    // compiler and supersedes Mutable.fields.
    /*mutable*/ /*@checkers.javari.quals.Mutable*/ Date d;

    // TODO: update this test case once compiler has generic annotations
    // in class file.
    /*this-mutable*/ Cell</*mutable*/ /*!@checkers.javari.quals.Mutable*/ Date> f;

    public void foo() /*readonly*/ {
        d.setDay(3);
    }

    public void bar() /*mutable*/ {
        d = new Date();
    }

    public void baz() /*readonly*/ {
        /*mutable*/ Date x = f.getVal();
        x.setDay(2);
    }

    public void quax() /*mutable*/ {
        f.setVal(new Date(3));
    }
}