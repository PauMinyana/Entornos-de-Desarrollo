class Main{
public static void main(String[] args) {
    int first=10;
    int second=20;

    comparaValores(first,second);
    System.out.println("Se ha acabado la funcion");

}

public static void comparaValores(int a, int b) {
    if(a>b){
        System.out.println("El primero es mayor");
    }else{
        System.out.println("El segundo es mayor");
    }

    for(int i=0;i<=5;i++){
        System.out.println(i);
    }
    
}

}