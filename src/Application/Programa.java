package Application;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.javadoc.SourcePosition;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
public class Programa {
	

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
			ChessMatch chessMatch = new ChessMatch();
			while (true) {
				try {
					UserInterface.clearScreen();	
					UserInterface.printBoard(chessMatch.getPieces());
					System.out.println();
					System.out.println("Origem:");
				
					ChessPosition source = UserInterface.readChessPosition(sc);
					
					System.out.println();
					System.out.println("Destino:");
				
					ChessPosition target = UserInterface.readChessPosition(sc);
					
					ChessPiece capturedPiece = chessMatch.perfomChessMove(source,target);
				
				}
				catch(ChessException e) {
					System.out.println(e.getMessage());
					sc.nextLine();
					
					
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
					
					
				}
				}

			
	        
		}

	}


