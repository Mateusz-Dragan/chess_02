package pl.edu.pwsztar.chess;


import org.springframework.stereotype.Component;
import pl.edu.pwsztar.chess.domain.Point;

@Component
public class Converter {


  public Point convert(String position) {

    int x = convertColumnToNumber(String.valueOf(position.charAt(0)));
    int y = (int) position.charAt(2);

    return new Point(x,y);
  }

  int convertColumnToNumber(String column) {
    if (column.equals("a")) {
      return 1;
    }
    if (column.equals("b")) {
      return 2;
    }
    if (column.equals("c")) {
      return 3;
    }
    if (column.equals("d")) {
      return 4;
    }
    if (column.equals("e")) {
      return 5;
    }
    if (column.equals("f")) {
      return 6;
    }
    if (column.equals("g")) {
      return 7;
    }
    if (column.equals("h")) {
      return 8;
    }

    return 0;
  }
}