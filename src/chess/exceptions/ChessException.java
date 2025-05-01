package chess.exceptions;

import boardgame.exceptions.BoardExceptions;

public class ChessException extends BoardExceptions {

    public ChessException(String msg){
        super(msg);
    }
}
