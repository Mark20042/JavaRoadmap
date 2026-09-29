
public class Annotation {

    public static void main(String a[]) {

        // @SuppressWarnings("unused")
        B obj = new B();
        obj.showTheDataWhichBelongsTothisClass();

    }
}

class A {

    // @Override
    public void showTheDataWhichBelongsTothisClass() {
        System.out.println("in A show");
    }
}

class B extends A {

    //  Annotation
    // @Override
    // 2. throws (for checked exception)
    // 3. @SuppressWarnings (itself annotation)
    // 4. @Deprecated (itself annotation)
    // 5. @SafeVarargs (itself annotation)
    // 6. @FunctionalInterface (itself annotation)
    // 7. @Repeatable (itself annotation)
    // 8. @Native (itself annotation)
    // 9. @Override (itself annotation)
    // 10. @SuppressWarnings (itself annotation)
    // @Override
    public void showTheDataWhichBelongTothisClass() {
        System.out.println("in B show");
    }
}
