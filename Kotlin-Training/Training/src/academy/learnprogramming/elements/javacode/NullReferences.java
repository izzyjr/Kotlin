package academy.learnprogramming.elements.javacode;

import com.sun.org.apache.xerces.internal.xs.PSVIProvider;

public class NullReferences {

    public static void main(String[] args) {

        // This would cause a null pointer exception
        String str = null;
        str.toUpperCase();

    }

}
