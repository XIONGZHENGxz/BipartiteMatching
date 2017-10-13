import java.lang.Math;
import java.util.Random;

public class GraphGenerator {
	public static Graph bipartite(int l, int r, double p) {
		Graph g = new Graph(l + r);
		for(int i = 0; i < l; i++) {
			for(int j = l; j < l + r; j++) {
				Random rand = new Random();
				if(rand.nextDouble() <= p) g.addEdge(i, j);
			}
		}
		return g;
	}
}

	
