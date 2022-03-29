package pl.edu.pwsztar.chess.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pwsztar.chess.Converter;
import pl.edu.pwsztar.chess.domain.Point;
import pl.edu.pwsztar.chess.domain.RulesOfGame;
import pl.edu.pwsztar.chess.dto.FigureMoveDto;
import pl.edu.pwsztar.chess.service.ChessService;

@Service
@Transactional
public class ChessServiceImpl implements ChessService {
    private RulesOfGame pawn;
    private RulesOfGame rook;
    private RulesOfGame bishop;
    private RulesOfGame knight;
    private RulesOfGame queen;
    private Converter convert;

    public ChessServiceImpl() {
        pawn = new RulesOfGame.Pawn();
        rook = new RulesOfGame.Rook();
        bishop = new RulesOfGame.Bishop();
        knight = new RulesOfGame.Knight();
        queen = new RulesOfGame.Queen();
        convert = new Converter();
    }

    public boolean isCorrectMove(FigureMoveDto figureMoveDto) {

        Point source = convert.convert(figureMoveDto.getSource());
        Point destination = convert.convert(figureMoveDto.getDestination());
        switch (figureMoveDto.getType()) {
            case PAWN:
                return pawn.isCorrectMove(source, destination);
            case ROOK:
                return rook.isCorrectMove(source, destination);
            case BISHOP:
                return bishop.isCorrectMove(source, destination);
            case KNIGHT:
                return knight.isCorrectMove(source, destination);
            case QUEEN:
                return queen.isCorrectMove(source, destination);
        }

        return false;
    }
}
