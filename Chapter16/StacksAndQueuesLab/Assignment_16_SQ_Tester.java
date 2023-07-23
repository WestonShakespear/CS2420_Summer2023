
public class Assignment_16_SQ_Tester {

	public static void main(String[] args) {
		{
			System.out.println("Testing Stack methods");
			Stack<String> a = new Stack<String>();
			Stack<String> b = new Stack<String>();
			Stack<String> c = new Stack<String>();
			try {
				if(!a.isEmpty()){
					throw new Exception("Error with isEmpty() method.  New stacks should be empty");
				}
				if(!b.isEmpty()){
					throw new Exception("Error with isEmpty() method.  New stacks should be empty");
				}
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  New stacks should be empty");
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				a.push("Dijkstra");
				if(!"Dijkstra".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'Dijkstra' received '"+a.top()+"'");
				}
				if(a.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				a.push("Edsger");
				if(!"Edsger".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'Edsger' received '"+a.top()+"'");
				}
				a.push("–");
				if(!"–".equals(a.top())){
					throw new Exception("Error with top() method.  Expected '–' received '"+a.top()+"'");
				}
				a.push("in.");
				if(!"in.".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'in.' received '"+a.top()+"'");
				}
				a.push("them");
				if(!"them".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'them' received '"+a.top()+"'");
				}
				a.push("putting");
				if(!"putting".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'putting' received '"+a.top()+"'");
				}
				a.push("of");
				if(!"of".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'of' received '"+a.top()+"'");
				}
				a.push("process");
				if(!"process".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'process' received '"+a.top()+"'");
				}
				a.push("the");
				if(!"the".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'the' received '"+a.top()+"'");
				}
				a.push("be");
				if(!"be".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'be' received '"+a.top()+"'");
				}
				a.push("must");
				if(!"must".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'must' received '"+a.top()+"'");
				}
				a.push("programming");
				if(!"programming".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'programming' received '"+a.top()+"'");
				}
				a.push("then");
				if(!"then".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'then' received '"+a.top()+"'");
				}
				a.push("bugs,");
				if(!"bugs,".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'bugs,' received '"+a.top()+"'");
				}
				a.push("software");
				if(!"software".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'software' received '"+a.top()+"'");
				}
				a.push("removing");
				if(!"removing".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'removing' received '"+a.top()+"'");
				}
				a.push("of");
				if(!"of".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'of' received '"+a.top()+"'");
				}
				a.push("process");
				if(!"process".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'process' received '"+a.top()+"'");
				}
				a.push("the");
				if(!"the".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'the' received '"+a.top()+"'");
				}
				a.push("is");
				if(!"is".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'is' received '"+a.top()+"'");
				}
				a.push("debugging");
				if(!"debugging".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'debugging' received '"+a.top()+"'");
				}
				a.push("If");
				if(!"If".equals(a.top())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.top()+"'");
				}
				if(!"If".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'If' received '"+a.top()+"'");
				}
				a.pop();
				if(!"debugging".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'debugging' received '"+a.top()+"'");
				}
				a.pop();
				if(!"is".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'is' received '"+a.top()+"'");
				}
				a.pop();
				if(!"the".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'the' received '"+a.top()+"'");
				}
				a.pop();
				if(!"process".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'process' received '"+a.top()+"'");
				}
				a.pop();
				if(!"of".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'of' received '"+a.top()+"'");
				}
				a.pop();
				if(!"removing".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'removing' received '"+a.top()+"'");
				}
				a.pop();
				if(!"software".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'software' received '"+a.top()+"'");
				}
				a.pop();
				if(!"bugs,".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'bugs,' received '"+a.top()+"'");
				}
				a.pop();
				if(!"then".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'then' received '"+a.top()+"'");
				}
				a.pop();
				if(!"programming".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'programming' received '"+a.top()+"'");
				}
				a.pop();
				if(!"must".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'must' received '"+a.top()+"'");
				}
				a.pop();
				if(!"be".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'be' received '"+a.top()+"'");
				}
				a.pop();
				if(!"the".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'the' received '"+a.top()+"'");
				}
				a.pop();
				if(!"process".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'process' received '"+a.top()+"'");
				}
				a.pop();
				if(!"of".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'of' received '"+a.top()+"'");
				}
				a.pop();
				if(!"putting".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'putting' received '"+a.top()+"'");
				}
				a.pop();
				if(!"them".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'them' received '"+a.top()+"'");
				}
				a.pop();
				if(!"in.".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'in.' received '"+a.top()+"'");
				}
				a.pop();
				if(!"–".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected '–' received '"+a.top()+"'");
				}
				a.pop();
				if(!"Edsger".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'Edsger' received '"+a.top()+"'");
				}
				a.pop();
				if(!"Dijkstra".equals(a.top())){
					throw new Exception("Error with either the pop() or top() method.  Expected 'Dijkstra' received '"+a.top()+"'");
				}
				a.pop();
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			String answer = "";
			try {
				b.push("Raymond");
				if(b.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				b.push("S.");
				b.push("Eric");
				b.push("–");
				b.push("painter.");
				b.push("expert");
				b.push("an");
				b.push("somebody");
				b.push("make");
				b.push("can");
				b.push("pigment");
				b.push("and");
				b.push("brushes");
				b.push("studying");
				b.push("than");
				b.push("more");
				b.push("any");
				b.push("programmer");
				b.push("expert");
				b.push("an");
				b.push("anybody");
				b.push("make");
				b.push("cannot");
				b.push("education");
				b.push("science");
				b.push("Computer");
				answer = b.topAndPop();
				if(!"Computer".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'Computer' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"science".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'science' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"education".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'education' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"cannot".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'cannot' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"make".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'make' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"anybody".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'anybody' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"an".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'an' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"expert".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'expert' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"programmer".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'programmer' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"any".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'any' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"more".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'more' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"than".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'than' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"studying".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'studying' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"brushes".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'brushes' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"and".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'and' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"pigment".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'pigment' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"can".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'can' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"make".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'make' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"somebody".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'somebody' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"an".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'an' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"expert".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'expert' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"painter.".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'painter.' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"–".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected '–' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"Eric".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'Eric' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"S.".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'S.' received '"+answer+"'");
				}
				answer = b.topAndPop();
				if(!"Raymond".equals(answer)){
					throw new Exception("Error with the popAndTop() method.  Expected 'Raymond' received '"+answer+"'");
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				c.push("z");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("y");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("x");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("w");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("v");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("u");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("t");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("s");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("r");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("q");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("p");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("o");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("n");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("m");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("l");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("k");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("j");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("i");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("h");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("g");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("f");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("e");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("d");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("c");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("b");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
				c.push("a");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, stacks should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, stack should be empty");
				}
				answer = c.top();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, stack should be empty and return null from top() method");
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			System.out.println("Finished Stack testing");
		}
		{
			System.out.println("Testing Queue methods");
			Queue<String> a = new Queue<String>();
			Queue<String> b = new Queue<String>();
			Queue<String> c = new Queue<String>();
			try {
				if(!a.isEmpty()){
					throw new Exception("Error with isEmpty() method.  New Queues should be empty");
				}
				if(!b.isEmpty()){
					throw new Exception("Error with isEmpty() method.  New Queues should be empty");
				}
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  New Queues should be empty");
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				a.enqueue("If");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				if(a.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				a.enqueue("debugging");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("is");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("the");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("process");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("of");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("removing");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("software");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("bugs,");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("then");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("programming");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("must");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("be");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("the");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("process");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("of");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("putting");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("them");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("in.");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("–");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("Edsger");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.enqueue("Dijkstra");
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with top() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				if(!"If".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'If' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"debugging".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'debugging' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"is".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'is' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"the".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'the' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"process".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'process' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"of".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'of' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"removing".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'removing' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"software".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'software' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"bugs,".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'bugs,' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"then".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'then' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"programming".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'programming' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"must".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'must' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"be".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'be' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"the".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'the' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"process".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'process' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"of".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'of' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"putting".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'putting' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"them".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'them' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"in.".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'in.' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"–".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected '–' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"Edsger".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'Edsger' received '"+a.getFront()+"'");
				}
				a.dequeue();
				if(!"Dijkstra".equals(a.getFront())){
					throw new Exception("Error with either the dequeue() or getFront() method.  Expected 'Dijkstra' received '"+a.getFront()+"'");
				}
				a.dequeue();
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			String answer = "";
			try {
				b.enqueue("Computer");
				if(b.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				b.enqueue("science");
				b.enqueue("education");
				b.enqueue("cannot");
				b.enqueue("make");
				b.enqueue("anybody");
				b.enqueue("an");
				b.enqueue("expert");
				b.enqueue("programmer");
				b.enqueue("any");
				b.enqueue("more");
				b.enqueue("than");
				b.enqueue("studying");
				b.enqueue("brushes");
				b.enqueue("and");
				b.enqueue("pigment");
				b.enqueue("can");
				b.enqueue("make");
				b.enqueue("somebody");
				b.enqueue("an");
				b.enqueue("expert");
				b.enqueue("painter.");
				b.enqueue("–");
				b.enqueue("Eric");
				b.enqueue("S.");
				b.enqueue("Raymond");
				answer = b.getFrontAndDequeue();
				if(!"Computer".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'Computer' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"science".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'science' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"education".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'education' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"cannot".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'cannot' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"make".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'make' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"anybody".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'anybody' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"an".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'an' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"expert".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'expert' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"programmer".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'programmer' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"any".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'any' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"more".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'more' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"than".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'than' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"studying".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'studying' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"brushes".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'brushes' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"and".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'and' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"pigment".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'pigment' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"can".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'can' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"make".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'make' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"somebody".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'somebody' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"an".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'an' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"expert".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'expert' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"painter.".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'painter.' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"–".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected '–' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"Eric".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'Eric' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"S.".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'S.' received '"+answer+"'");
				}
				answer = b.getFrontAndDequeue();
				if(!"Raymond".equals(answer)){
					throw new Exception("Error with the getFrontAndDequeue() method.  Expected 'Raymond' received '"+answer+"'");
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			try {
				c.enqueue("z");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("y");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("x");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("w");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("v");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("u");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("t");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("s");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("r");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("q");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("p");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("o");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("n");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("m");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("l");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("k");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("j");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("i");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("h");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("g");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("f");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("e");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("d");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("c");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("b");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
				c.enqueue("a");
				if(c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once something is added, Queues should NOT be empty");
				}
				c.makeEmpty();
				if(!c.isEmpty()){
					throw new Exception("Error with isEmpty() method.  Once the makeEmpty() method is called, Queues should be empty");
				}
				answer = c.getFront();
				if(answer != null){
					throw new Exception("Error with makeEmpty() method.  Once the makeEmpty() method is called, Queues should be empty and return null from getFront() method");
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			System.out.println("Finished Queue testing");
		}
	}


}
