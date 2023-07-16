
public class Assignment_17_Tester {

	public static void main(String[] args) {
		System.out.println("Testing LinkedList methods");
		LinkedList<String> a = new LinkedList<String>();
		LinkedList<String> b = new LinkedList<String>();
		LinkedList<String> c = new LinkedList<String>();
		try {
			a.insertEnd("If");
			if(LinkedList.listSize(a) != 1){
				throw new Exception("Error with listSize() method.  Expected '1' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("debugging");
			if(LinkedList.listSize(a) != 2){
				throw new Exception("Error with listSize() method.  Expected '2' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("is");
			if(LinkedList.listSize(a) != 3){
				throw new Exception("Error with listSize() method.  Expected '3' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("the");
			if(LinkedList.listSize(a) != 4){
				throw new Exception("Error with listSize() method.  Expected '4' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("process");
			if(LinkedList.listSize(a) != 5){
				throw new Exception("Error with listSize() method.  Expected '5' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("of");
			if(LinkedList.listSize(a) != 6){
				throw new Exception("Error with listSize() method.  Expected '6' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("removing");
			if(LinkedList.listSize(a) != 7){
				throw new Exception("Error with listSize() method.  Expected '7' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("software");
			if(LinkedList.listSize(a) != 8){
				throw new Exception("Error with listSize() method.  Expected '8' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("bugs,");
			if(LinkedList.listSize(a) != 9){
				throw new Exception("Error with listSize() method.  Expected '9' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("then");
			if(LinkedList.listSize(a) != 10){
				throw new Exception("Error with listSize() method.  Expected '10' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("programming");
			if(LinkedList.listSize(a) != 11){
				throw new Exception("Error with listSize() method.  Expected '11' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("must");
			if(LinkedList.listSize(a) != 12){
				throw new Exception("Error with listSize() method.  Expected '12' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("be");
			if(LinkedList.listSize(a) != 13){
				throw new Exception("Error with listSize() method.  Expected '13' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("the");
			if(LinkedList.listSize(a) != 14){
				throw new Exception("Error with listSize() method.  Expected '14' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("process");
			if(LinkedList.listSize(a) != 15){
				throw new Exception("Error with listSize() method.  Expected '15' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("of");
			if(LinkedList.listSize(a) != 16){
				throw new Exception("Error with listSize() method.  Expected '16' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("putting");
			if(LinkedList.listSize(a) != 17){
				throw new Exception("Error with listSize() method.  Expected '17' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("them");
			if(LinkedList.listSize(a) != 18){
				throw new Exception("Error with listSize() method.  Expected '18' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("in.");
			if(LinkedList.listSize(a) != 19){
				throw new Exception("Error with listSize() method.  Expected '19' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("–");
			if(LinkedList.listSize(a) != 20){
				throw new Exception("Error with listSize() method.  Expected '20' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("Edsger");
			if(LinkedList.listSize(a) != 21){
				throw new Exception("Error with listSize() method.  Expected '21' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertEnd("Dijkstra");
			if(LinkedList.listSize(a) != 22){
				throw new Exception("Error with listSize() method.  Expected '22' received '"+LinkedList.listSize(a)+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			b.insertEnd("Computer");
			if(! "Computer".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer' received '"+b.toString()+"'");
			}
			b.insertEnd("science");
			if(! "Computer science".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science' received '"+b.toString()+"'");
			}
			b.insertEnd("education");
			if(! "Computer science education".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education' received '"+b.toString()+"'");
			}
			b.insertEnd("cannot");
			if(! "Computer science education cannot".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot' received '"+b.toString()+"'");
			}
			b.insertEnd("make");
			if(! "Computer science education cannot make".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make' received '"+b.toString()+"'");
			}
			b.insertEnd("anybody");
			if(! "Computer science education cannot make anybody".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody' received '"+b.toString()+"'");
			}
			b.insertEnd("an");
			if(! "Computer science education cannot make anybody an".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an' received '"+b.toString()+"'");
			}
			b.insertEnd("expert");
			if(! "Computer science education cannot make anybody an expert".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert' received '"+b.toString()+"'");
			}
			b.insertEnd("programmer");
			if(! "Computer science education cannot make anybody an expert programmer".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer' received '"+b.toString()+"'");
			}
			b.insertEnd("any");
			if(! "Computer science education cannot make anybody an expert programmer any".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any' received '"+b.toString()+"'");
			}
			b.insertEnd("more");
			if(! "Computer science education cannot make anybody an expert programmer any more".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more' received '"+b.toString()+"'");
			}
			b.insertEnd("than");
			if(! "Computer science education cannot make anybody an expert programmer any more than".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than' received '"+b.toString()+"'");
			}
			b.insertEnd("studying");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying' received '"+b.toString()+"'");
			}
			b.insertEnd("brushes");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes' received '"+b.toString()+"'");
			}
			b.insertEnd("and");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and' received '"+b.toString()+"'");
			}
			b.insertEnd("pigment");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment' received '"+b.toString()+"'");
			}
			b.insertEnd("can");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can' received '"+b.toString()+"'");
			}
			b.insertEnd("make");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make' received '"+b.toString()+"'");
			}
			b.insertEnd("somebody");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody' received '"+b.toString()+"'");
			}
			b.insertEnd("an");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an' received '"+b.toString()+"'");
			}
			b.insertEnd("expert");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert' received '"+b.toString()+"'");
			}
			b.insertEnd("painter.");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter.".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter.' received '"+b.toString()+"'");
			}
			b.insertEnd("–");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. –".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. –' received '"+b.toString()+"'");
			}
			b.insertEnd("Eric");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric' received '"+b.toString()+"'");
			}
			b.insertEnd("S.");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S.".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S.' received '"+b.toString()+"'");
			}
			b.insertEnd("Raymond");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		c.insertEnd("a");
		c.insertEnd("b");
		c.insertEnd("c");
		c.insertEnd("d");
		c.insertEnd("a");
		c.insertEnd("b");
		c.insertEnd("c");
		c.insertEnd("d");
		c.insertEnd("a");
		c.insertEnd("b");
		c.insertEnd("c");
		c.insertEnd("d");
		try {
			if(a.findAndMoveToFront("must") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'must' received 'null'");
			}
			if(! "must If debugging is the process of removing software bugs, then programming be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'must If debugging is the process of removing software bugs, then programming be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("Edsger") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'Edsger' received 'null'");
			}
			if(! "Edsger must If debugging is the process of removing software bugs, then programming be the process of putting them in. – Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'Edsger must If debugging is the process of removing software bugs, then programming be the process of putting them in. – Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("removing") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'removing' received 'null'");
			}
			if(! "removing Edsger must If debugging is the process of software bugs, then programming be the process of putting them in. – Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'removing Edsger must If debugging is the process of software bugs, then programming be the process of putting them in. – Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("process") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'process' received 'null'");
			}
			if(! "process removing Edsger must If debugging is the of software bugs, then programming be the process of putting them in. – Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'process removing Edsger must If debugging is the of software bugs, then programming be the process of putting them in. – Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("of") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'of' received 'null'");
			}
			if(! "of process removing Edsger must If debugging is the software bugs, then programming be the process of putting them in. – Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'of process removing Edsger must If debugging is the software bugs, then programming be the process of putting them in. – Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("of") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'of' received 'null'");
			}
			if(! "of process removing Edsger must If debugging is the software bugs, then programming be the process of putting them in. – Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'of process removing Edsger must If debugging is the software bugs, then programming be the process of putting them in. – Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("–") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected '–' received 'null'");
			}
			if(! "– of process removing Edsger must If debugging is the software bugs, then programming be the process of putting them in. Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected '– of process removing Edsger must If debugging is the software bugs, then programming be the process of putting them in. Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("is") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'is' received 'null'");
			}
			if(! "is – of process removing Edsger must If debugging the software bugs, then programming be the process of putting them in. Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'is – of process removing Edsger must If debugging the software bugs, then programming be the process of putting them in. Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("then") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'then' received 'null'");
			}
			if(! "then is – of process removing Edsger must If debugging the software bugs, programming be the process of putting them in. Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'then is – of process removing Edsger must If debugging the software bugs, programming be the process of putting them in. Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("the") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'the' received 'null'");
			}
			if(! "the then is – of process removing Edsger must If debugging software bugs, programming be the process of putting them in. Dijkstra".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'the then is – of process removing Edsger must If debugging software bugs, programming be the process of putting them in. Dijkstra' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("Dijkstra") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'Dijkstra' received 'null'");
			}
			if(! "Dijkstra the then is – of process removing Edsger must If debugging software bugs, programming be the process of putting them in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'Dijkstra the then is – of process removing Edsger must If debugging software bugs, programming be the process of putting them in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("–") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected '–' received 'null'");
			}
			if(! "– Dijkstra the then is of process removing Edsger must If debugging software bugs, programming be the process of putting them in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected '– Dijkstra the then is of process removing Edsger must If debugging software bugs, programming be the process of putting them in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("them") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'them' received 'null'");
			}
			if(! "them – Dijkstra the then is of process removing Edsger must If debugging software bugs, programming be the process of putting in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'them – Dijkstra the then is of process removing Edsger must If debugging software bugs, programming be the process of putting in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("them") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'them' received 'null'");
			}
			if(! "them – Dijkstra the then is of process removing Edsger must If debugging software bugs, programming be the process of putting in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'them – Dijkstra the then is of process removing Edsger must If debugging software bugs, programming be the process of putting in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("putting") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'putting' received 'null'");
			}
			if(! "putting them – Dijkstra the then is of process removing Edsger must If debugging software bugs, programming be the process of in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'putting them – Dijkstra the then is of process removing Edsger must If debugging software bugs, programming be the process of in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("If") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'If' received 'null'");
			}
			if(! "If putting them – Dijkstra the then is of process removing Edsger must debugging software bugs, programming be the process of in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'If putting them – Dijkstra the then is of process removing Edsger must debugging software bugs, programming be the process of in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("the") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'the' received 'null'");
			}
			if(! "the If putting them – Dijkstra then is of process removing Edsger must debugging software bugs, programming be the process of in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'the If putting them – Dijkstra then is of process removing Edsger must debugging software bugs, programming be the process of in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("removing") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'removing' received 'null'");
			}
			if(! "removing the If putting them – Dijkstra then is of process Edsger must debugging software bugs, programming be the process of in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'removing the If putting them – Dijkstra then is of process Edsger must debugging software bugs, programming be the process of in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("process") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'process' received 'null'");
			}
			if(! "process removing the If putting them – Dijkstra then is of Edsger must debugging software bugs, programming be the process of in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'process removing the If putting them – Dijkstra then is of Edsger must debugging software bugs, programming be the process of in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("of") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'of' received 'null'");
			}
			if(! "of process removing the If putting them – Dijkstra then is Edsger must debugging software bugs, programming be the process of in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'of process removing the If putting them – Dijkstra then is Edsger must debugging software bugs, programming be the process of in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("then") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'then' received 'null'");
			}
			if(! "then of process removing the If putting them – Dijkstra is Edsger must debugging software bugs, programming be the process of in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'then of process removing the If putting them – Dijkstra is Edsger must debugging software bugs, programming be the process of in.' received '"+a.toString()+"'");
			}
			if(a.findAndMoveToFront("programming") == null ){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'programming' received 'null'");
			}
			if(! "programming then of process removing the If putting them – Dijkstra is Edsger must debugging software bugs, be the process of in.".equals(a.toString())){
				throw new Exception("Error with findAndMoveToFront and then the toString method.  Expected 'programming then of process removing the If putting them – Dijkstra is Edsger must debugging software bugs, be the process of in.' received '"+a.toString()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			if(a.findAndMoveToFront("Abbi Abuaita") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Abbi Abuaita").getItem()+"'");
			}
			if(a.findAndMoveToFront("Cal Denos") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Cal Denos").getItem()+"'");
			}
			if(a.findAndMoveToFront("Charo Dok") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Charo Dok").getItem()+"'");
			}
			if(a.findAndMoveToFront("Iolande Easley") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Iolande Easley").getItem()+"'");
			}
			if(a.findAndMoveToFront("Jeanie Foor") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Jeanie Foor").getItem()+"'");
			}
			if(a.findAndMoveToFront("Kathryne Macdonell") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Kathryne Macdonell").getItem()+"'");
			}
			if(a.findAndMoveToFront("Lyda Moralas") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Lyda Moralas").getItem()+"'");
			}
			if(a.findAndMoveToFront("Maria Nudelman") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Maria Nudelman").getItem()+"'");
			}
			if(a.findAndMoveToFront("Melli Racina") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Melli Racina").getItem()+"'");
			}
			if(a.findAndMoveToFront("Shelli Vautour") != null){
				throw new Exception("Error with findAndMoveToFront method.  Expected 'null' received '"+a.find("Shelli Vautour").getItem()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			if(c.previous("d") == null || ! "c".equals(c.previous("d").getItem())){
				throw new Exception("Error with find method.  Expected 'c' received '"+c.previous("d").getItem()+"'");
			}
			if(c.previous("c") == null || ! "b".equals(c.previous("c").getItem())){
				throw new Exception("Error with find method.  Expected 'b' received '"+c.previous("c").getItem()+"'");
			}
			if(c.previous("b") == null || ! "a".equals(c.previous("b").getItem())){
				throw new Exception("Error with find method.  Expected 'a' received '"+c.previous("b").getItem()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			c.removeLast("d");
			c.removeLast("Abbi Abuaita");
			if(! "a b c d a b c d a b c".equals(c.toString())){
				throw new Exception("Error with removeLast method.  Expected 'a b c d a b c d a b c' received '"+c.toString()+"'");
			}
			c.removeLast("d");
			c.removeLast("Cal Denos");
			if(! "a b c d a b c a b c".equals(c.toString())){
				throw new Exception("Error with removeLast method.  Expected 'a b c d a b c a b c' received '"+c.toString()+"'");
			}
			c.removeLast("d");
			c.removeLast("Charo Dok");
			if(! "a b c a b c a b c".equals(c.toString())){
				throw new Exception("Error with removeLast method.  Expected 'a b c a b c a b c' received '"+c.toString()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			c.removeAll("b");
			c.removeAll("Abbi Abuaita");
			if(! "a c a c a c".equals(c.toString())){
				throw new Exception("Error with removeAll method.  Expected 'a c a c a c' received '"+c.toString()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished LinkedList testing");

	}

}
