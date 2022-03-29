package pl.edu.pwsztar.chess.domain;


public interface RulesOfGame {

    /**
     * Metoda zwraca true, tylko gdy przejscie z polozenia
     * source na destination w jednym ruchu jest zgodne
     * z zasadami gry w szachy
     */
    boolean isCorrectMove(Point source, Point destination);

    class Pawn implements RulesOfGame{

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if((source.getY() + 1 == destination.getY()) && (destination.getX()>= source.getX())){
                return true;
            }
            return false;
        }
    }

    class Rook implements RulesOfGame{

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if( source.getY() != destination.getY() && source.getX() != destination.getX()){
                return false;
            }
            return true;
        }
    }

    class Bishop implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if(source.getX() == destination.getX() && source.getY() == destination.getY()) {
                return false;
            }

            return Math.abs(destination.getX() - source.getX()) ==
                    Math.abs(destination.getY() - source.getY());
        }
    }

    class Knight implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            // TODO: Prosze dokonczyc implementacje
            return true;
        }
    }

    class Queen implements RulesOfGame{
        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if( source.getY() != destination.getY() && source.getX() != destination.getX() || source.getX() == destination.getX() && source.getY() == destination.getY()){
                return false;
            }
            return true;
        }
    }

    // TODO: Prosze dokonczyc implementacje kolejnych figur szachowych: Knight, King, Queen, Rook, Pawn
    // TODO: Prosze stosowac zaproponowane nazwy klas !!!
    // TODO: Kazda klasa powinna implementowac interfejs RulesOfGame
}