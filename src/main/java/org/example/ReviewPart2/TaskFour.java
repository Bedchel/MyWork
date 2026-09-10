package org.example.ReviewPart2;

public class TaskFour {
    static void main() {
        Outor outor = new Outor();
        Outor.Inner inner = outor.new Inner();
        Outor.StaticNested staticObject = new Outor.StaticNested();

        System.out.println(inner.writerOuterField());
        System.out.println(staticObject.staticWriterOuterField());
    }
}

class Outor {
    private String outerField = "Secret";

    class Inner {
        public String writerOuterField() {
            return outerField;
        }
    }

    static class StaticNested {
        public String staticWriterOuterField() {
            return new Outor().outerField;
        }
    }
}