import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

	public static void main(String[] args){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		MyBinarySearchTree MBST = new MyBinarySearchTree();
		while(true){
			System.out.println("\t1.  Insert key in BST");
			System.out.println("\t2.  Delete key from BST");
			System.out.println("\t3.  Search for key in BST");
			System.out.println("\t4.  Display height of BST");
			System.out.println("\t5.  Display size of BST");
			System.out.println("\t6.  Display content of BST in inorder");
			System.out.println("\t7.  Display content of BST in preorder");
			System.out.println("\t8.  Display content of BST in postorder");
			System.out.println("\t9.  Build copy of the tree, and test it");
			System.out.println("\t10. Exit program");

			try{
				switch(Integer.parseInt(read.readLine())){
				
				case 1:

				}
			}

			catch(IOException e){

			}
		}
	}
}