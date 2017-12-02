package com.rath.tagm;

import java.util.Scanner;

import com.rath.tagm.board.Board;
import com.rath.tagm.board.Panel;
import com.rath.tagm.metrics.ClassicRuleSet;
import com.rath.tagm.metrics.GameStats;
import com.rath.tagm.util.PanelGenerator;

public class PanelGeneratorDemo {

  public static void main(String[] args) {
    final ClassicRuleSet rs = new ClassicRuleSet();
    final Board board = new Board(rs);
    
    final Scanner sc = new Scanner(System.in);
    
    while(true) {
      final Panel[] row = PanelGenerator.generateRow(new GameStats(rs), rs, board.getRow(0), board.getRow(1));
      board.appendRow(row);
      System.out.print(Board.getRowString(row));
      sc.nextLine();
    }
    
  }
}
