protected class A{

int num =55;

void d1(){
System.out.println("H1");
}

}
class B extends A{

void d2(){
System.out.println("H2");
}

}
class C extends B{

void d3(){
System.out.println("H3");
}

}
class D{

public static void main(String args[]){

C cc = new C();
System.out.println(cc.num);
cc.d1();
cc.d2();
cc.d3();
	
}

}