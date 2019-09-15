package modelo;
public class Mundo {
		private Avión avi;
		private Pájaro paj;
		private Superman sup;
		private Bicicleta bic;
		private Supergirl supg;
		private NaveEspacial nav;
		
		
			public Mundo() {
				avi= new Avión();
				bic= new Bicicleta();
				paj= new Pájaro();
				sup= new Superman();
				supg= new Supergirl();
				nav= new NaveEspacial();
			}

			public Bicicleta getBic() {
				return bic;
			}

			public void setBic(Bicicleta bic) {
				this.bic = bic;
			}

			public Supergirl getSupg() {
				return supg;
			}

			public void setSupg(Supergirl supg) {
				this.supg = supg;
			}

			public NaveEspacial getNav() {
				return nav;
			}

			public void setNav(NaveEspacial nav) {
				this.nav = nav;
			}

			public Avión getAvi() {
				return avi;
			}

			public void setAvi(Avión avi) {
				this.avi = avi;
			}

			public Pájaro getPaj() {
				return paj;
			}

			public void setPaj(Pájaro paj) {
				this.paj = paj;
			}

			public Superman getSup() {
				return sup;
			}

			public void setSup(Superman sup) {
				this.sup = sup;
			}

			
			
}

