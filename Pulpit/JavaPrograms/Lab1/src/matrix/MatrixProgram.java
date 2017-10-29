package matrix;

public class MatrixProgram{
    public static void main(String [] argv) throws MatrixDimensionsException, Exception {
        try {
            Matrix ne=new Matrix("/home/ela/Pulpit/1.txt");
            ne.print();
            int[][] scores = {{1, 2, 3},
                    {1, 2, 3},
                    {1, 2, 3}
            };

            int[][] scores2 = {{1, 2, 3},
                    {1, 2, 3},
                    {1, 2, 3}
            };
            Matrix m = new Matrix(scores);
            Matrix m2 = new Matrix(scores2);


            Matrix x = m.mul(ne);


           x.print();



           // x = m.mul(m2);
//            x=m.mul(ne);
//            x.print();
//
//
//            x = m.sub(m2);
//            x.print();
        }catch(Exception e){
            throw e;
        }//finally {
            //zamknięcie zasobu
            // plikDane.close();
        };


    }

