package lab14.task5032;

public class Rectangle5032 {
    public double x = 100;
    public double y = 100;
    public double width = 100;
    public double height = 100;


    public void corX(double a) {


        if (x + a <= 0) {
            IllegalArgumentException ex = new IllegalArgumentException("Х не может быть отрицательным");
            throw ex;
        } else {
            x = x + a;

        }
    }


        public void corY ( double a){

            if (y + a <= 0) {
                IllegalArgumentException ex = new IllegalArgumentException("Y не может быть отрицательным");
                throw ex;
            } else {
                y = y + a;

            }
        }

        public void width ( double a){
            if (width + a <= 0) {
                IllegalArgumentException ex = new IllegalArgumentException("Width Должен быть положительным");
                throw ex;
            } else {
                width = width + a;

            }
        }

        public void height ( double a){
            if (height + a <= 0) {
                IllegalArgumentException ex = new IllegalArgumentException("Height Должен быть положительным");
                throw ex;
            } else {
                height = height + a;

            }

        }


        @Override
        public String toString () {
            return "<rect x=\"" + x + "\" y=\"" + y + "\" width=\"" + width + "\" height=\"" + height + "\" fill=\"transparent\" stroke=\"black\">" +
                    "</rect>\n" + "</svg></td>";
        }
    }

