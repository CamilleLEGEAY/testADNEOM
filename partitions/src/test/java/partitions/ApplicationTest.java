package partitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ApplicationTest {
	
	
	@Test
	public void partitionsUn() {
		Application application = new Application();
		List<Integer> liste = Arrays.asList(1,2,3,4,5);
		
		List<Integer> s1 = Arrays.asList(1);
		List<Integer> s2 = Arrays.asList(2);
		List<Integer> s3 = Arrays.asList(3);
		List<Integer> s4 = Arrays.asList(4);
		List<Integer> s5 = Arrays.asList(5);
		List<List<Integer>> resultat = new ArrayList<List<Integer>>() {{
			add(s1);
			add(s2);
			add(s3);
			add(s4);
			add(s5);
		}};
		assertEquals(resultat, application.partition(liste,1));
	}
	
	@Test
	public void partitionsDeux() {
		Application application = new Application();
		List<Integer> liste = Arrays.asList(1,2,3,4,5);
		
		List<Integer> s1 = Arrays.asList(1,2);
		List<Integer> s2 = Arrays.asList(3,4);
		List<Integer> s3 = Arrays.asList(5);
		List<List<Integer>> resultat = new ArrayList<List<Integer>>() {{
			 add(s1);
			 add(s2);
			 add(s3);
			}};
		assertEquals(resultat, application.partition(liste,2));
	}
	
	@Test
	public void partitionsTrois() {
		Application application = new Application();
		List<Integer> liste = Arrays.asList(1,2,3,4,5);
		
		List<Integer> s1 = Arrays.asList(1,2,3);
		List<Integer> s2 = Arrays.asList(4,5);
		List<List<Integer>> resultat = new ArrayList<List<Integer>>() {{
			add(s1);
			add(s2);
		}};
		assertEquals(resultat, application.partition(liste,3));
	}

}
