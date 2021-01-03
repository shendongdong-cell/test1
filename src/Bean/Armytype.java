package Bean;

public class Armytype {
         private String armytype;
         private String armyName;
         
		public Armytype(String armytype, String armyName) {
			super();
			this.armytype = armytype;
			this.armyName = armyName;
		}
		public String getArmytype() {
			return armytype;
		}
		public void setArmytype(String armytype) {
			this.armytype = armytype;
		}
		public String getArmyName() {
			return armyName;
		}
		public void setArmyName(String armyName) {
			this.armyName = armyName;
		}
}
