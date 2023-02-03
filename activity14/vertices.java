//package activity14;
//
//import java.util.*;
//import java.io.*;
//
//public class vertices{
//
//	public static void main(String[] args) {
//        
//		Scanner kbd = new Scanner(System.in);
//        
//        LinkedList<LinkedList<String>> verticesLL = new LinkedList<LinkedList<String>>();
//
//        System.out.println("Enter the vertices(seperated by comma):");
//        String vertices = kbd.nextLine();
//        
//        String token[] = vertices.split(",");
//        
//        System.out.println("Enter the edges(seperated by comma):");
//        String edges = kbd.nextLine();
//        
//        String token2[] = edges.split(",");
//        
//        for (int i = 0; i < token.length;i++) {
//              LinkedList<String> temp = new LinkedList<String>();
//              temp.add(token[i]);
//              for(int j = 0; j < token2.length; j++) {
//              if (token[i].charAt(0) == token2[j].charAt(0)) {
//                    String newEdges = "";
//                    newEdges += token2[j].charAt(1);
//                    
//                    temp.add(newEdges);
//                    }
//              }
//              verticesLL.add(temp);
//        }
//        
//        for(int i = 0; i < verticesLL.size(); i++) {
//              System.out.print(verticesLL.get(i));
//              System.out.println("\n");
//        }
//        
//        
//        
//  }
//}
	
	


