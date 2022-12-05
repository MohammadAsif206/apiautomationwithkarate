import com.apilearning.entities.Experience;
import com.apilearning.entities.JobInfo;
import com.apilearning.entities.JobPortal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.*;



public class DemoMain {
    public DemoMain(){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.setSize(500,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();
        // label
        JLabel welcomeBar = new JLabel();
        jPanel.add(welcomeBar);
        jPanel.add(up);
        jPanel.add(down);
        jPanel.add(left);
        jPanel.add(right);

        up.setText("Up: 0");

        down.setText("Down: 0");
        left.setText("Left: 0");
        right.setText("Right: 0");

        jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
            int upKey = 0;
            int downKey=0;
            int leftKey=0,rightKey=0;
            @Override
            public void keyPressed(KeyEvent e) {
                int count = e.getKeyCode();

                switch (count) {
                    case KeyEvent.VK_UP:
                        up.setText("Up: "+Integer.toString(upKey++));
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down: "+Integer.toString(downKey++));
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("Left: "+Integer.toString(leftKey++));
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right: "+Integer.toString(rightKey++));
                        break;

                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        jFrame.add(jPanel);
    }
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
      //  new DemoMain();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the year you were born: ");
//        int y = scanner.nextInt();
//        System.out.println("Please enter the month in which you born: ");
//        int m = scanner.nextInt();
//        System.out.println("Please enter the day in which you born");
//        int d = scanner.nextInt();
//        calcage(y,m,d);

   // reactionTime();
   //     exponensialGrowth();
    //    decryption();
     //   offsetAlphabet();
        File fileReader = new File("src/main/java/com/apilearning/input.txt");
        Scanner scanner = new Scanner(fileReader);
        DemoMain g = new DemoMain(4);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String [] str = s.split(" ");
            g.addEdge(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
        }
//        System.out.println("File: "+fileReader.toString());
//        DemoMain g = new DemoMain(4);
//        g.addEdge(0,1);
//        g.addEdge(0,2);
//        g.addEdge(1,2);
//        g.addEdge(2,0);
//        g.addEdge(2,3);
//        g.addEdge(3,3);
        System.out.println("Following is Breads First Traversal: Start from from vertex 2");
        g.BFS(3);

        int [] ar = {10,4,1,5,90,11,12,3,2,6,8};
        Long bStartTime = System.currentTimeMillis();
        resverArray(ar);
        long bFinishTime = System.currentTimeMillis();
        System.out.println("\nBubble sort Time complexity: "+(bFinishTime-bStartTime));
        int [] ari = {10,4,1,5,90,11,12,3,2,6,8};

        Long iStartTime = System.currentTimeMillis();
        insertionSort(ari);
        long iFinishTime = System.currentTimeMillis();
        System.out.println("\nInsertion sort Time complexity: "+(iFinishTime-iStartTime));

    }

    public static void calcage(int y, int m, int d){
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.of(y,m,d);
        int age = Period.between(birthdate,today).getYears();
        int month = Period.between(birthdate,today).getMonths();
        int day = Period.between(birthdate,today).getDays();
        System.out.println("Your age's year is: "+age+" Month: "+month+" Days: "+day);

    }
    public static void reactionTime() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO >>>>>>");
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        long finishTime = System.currentTimeMillis();
        System.out.println("Reaction time: "+(finishTime-startTime)+" ms");

        System.out.println(System.console());
        System.out.println(System.getenv().size());
        System.out.println(System.getProperties());
        System.out.println(System.lineSeparator());
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("os.name"));
        String s = "Asif"+System.lineSeparator()+"Mohammad";
        System.out.println(s);
        System.out.println("Timezone: "+LocalDate.now(ZoneId.systemDefault()));

        System.out.println("Timezone US: "+LocalDate.EPOCH);
        System.out.println("Timezone MIN: "+LocalDate.MIN);
        System.out.println("Timezone MAX: "+LocalDate.MAX);

        System.out.println("Current time to Epoch: "+LocalDate.of(2022,11,13).toEpochDay());

    }
    public static void exponensialGrowth(){
        //formula a(1+r)^x where a = initial value, r = rate of growth, x = time interval
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter the initial value: ");
       int a = scanner.nextInt();
        System.out.println("Pleas enter growth rate: ");
       double r = scanner.nextDouble();
        System.out.println("Pleas enter the duration: ");
        int x = scanner.nextInt();
        int result = (int)(a * Math.pow((1+r),x));
        System.out.println("Your growth is: "+result);
    }
    public static void decryption(){
        String s ="How are you doing my friend?";
        char [] c = s.toCharArray();
        char [] enc= s.toCharArray();
        String s1="";
        for(char d: c){
            d+=2;
            s1+=d;
            System.out.print(d);
        }
        System.out.println("\nfirst encryption: "+s1);
        s1 = s1.toUpperCase();
        String s2="";String s3="";
        char [] c1 = s1.toCharArray();
        for(char d2: c1){
            System.out.print((d2+=1));
            s2+=d2;
        }
        System.out.println();
        char [] c2 = s2.toCharArray();
        for(char d2: c2){
            System.out.print((d2-=1));
            s3+=d2;
        }
        System.out.println();
        char [] c3 = s3.toCharArray();
        for(char d2: c3){
            System.out.print((d2-=2));
           // s2+=d2;
        }

    }
    public static void resverArray(int [] ar){
        int temp=0;
        for(int i = 0;i<ar.length-1;i++){

            for(int j = 1; j<ar.length-i;j++){
                if(ar[j-1]>ar[j]){
                    temp = ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                   // System.out.println(ar[i]);


                }

            }
        }
        for(Integer g : ar)
            System.out.print(g+" ");
    }
    public static void  insertionSort(int [] ar){
        for(int i = 1; i<ar.length;i++){
            int temp = ar[i];
            int j = i-1;
            while (j>=0 && temp <=ar[j]){
                ar[j+1]=ar[j];
                j = j-1;
            }
            ar[j+1]=temp;
        }
        for(Integer g : ar)
            System.out.print(g+" ");
    }
    //This class represents a directed graph using adjacency list representation
    private int v; //number of vertices
    private LinkedList<Integer> adj[]; //Adjacency list
    //Constructor
    DemoMain(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    //function to add an edge into the graph
    void addEdge(int v, int w){
            adj[v].add(w);
    }
    // print BFS traversal from a given source s
    void BFS(int s){
        //Mark al the vertices as not visited (by default) bey setting as false
        boolean visited [] = new boolean[this.v];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        //Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size()!=0){
            //Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.println(s+" ");
            // Get all adjacent vertices of the dequeued vertex s. If an adjacent has not
            // been visited, then mark it visited and enqueue it
            Iterator<Integer> iterator = adj[s].listIterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }

    }
    public static  void offsetAlphabet(){
        String asif = "y z";
        String answer = "";
        char [] chars = asif.toCharArray();
        for(int i = 0; i<chars.length;i++){
            if(chars[i] != ' ' && chars[i]<'z'){
                answer+=(char)(chars[i]+2);
            }if(chars[i]==' '){
                answer+=(char)chars[i];
            }if(chars[i]=='y'){
                answer+=(char)((chars[i]-22));
            }if(chars[i]=='z'){
                answer+=(char)(((chars[i])-25));
            }
        }
//        for(Character c: chars)
//               System.out.println(" "+c);
        System.out.println(answer);
    }

}