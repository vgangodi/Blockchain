import java.util.ArrayList;
 
/*
 * previousHash
 * transactions
 * Hash 
 */

public class Main {
	
	ArrayList<Block> blockchain = new ArrayList<>();
	
	public static void main(String[] args) {
		String[] genesisTransactions = {"viswa", "gang", "stupid"};
		Block genesisBlock = new Block(0, genesisTransactions);
		
		String[] block2Transactions = {"he", "is", "dumb"};
		Block block2= new Block(genesisBlock.getBlockHash(), block2Transactions);
		
		String[] block3Transactions = {"fucking", "serious"};
		Block block3= new Block(genesisBlock.getBlockHash(), block3Transactions);
		
		System.out.println("Hash of Genesis Block");
		System.out.println(genesisBlock.getBlockHash());
		System.out.println("Hash of Block2");
		System.out.println(block2.getBlockHash());
		System.out.println("Hash of Block3");
		System.out.println(block3.getBlockHash());
	}

}
