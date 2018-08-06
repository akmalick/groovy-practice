//1+1
//println "Hello World"
//println ("Hello World");

/////////Powers of two
int n = 10;
List list = new ArrayList();
for(int i =0; i <n; i++){
    list.add(Math.pow(2,i));
}
println(list);

(0..< 10).collect {2**it}


(0..<10).stream().map{2**it}.forEach{println it}

































