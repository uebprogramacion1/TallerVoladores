package modelo;

public class Superman implements Volador,Amigable{
Kriptoniano x=new Kriptoniano();

@Override
public String empezarVuelo() {
	// TODO Auto-generated method stub
	return "iniciando vuelo";
}

@Override
public String volar() {
	// TODO Auto-generated method stub
	return "volando";
}

@Override
public String aterrisar() {
	// TODO Auto-generated method stub
	return "aterrizando";
}
@Override
public String amigo() {
	// TODO Auto-generated method stub
	return "salvando personas";
};
public String saltarEdificio() {
	return"saltando edificio"; 
};
public String pararBala() {
	return "parando bala";
}


}
