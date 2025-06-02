public class Subnet {
    private String name;
    private String addresseReseau;
    private String addresseBroadcast;
    private String premAddUtilisable;
    private String dernAddUtilisable;
    private int masque;
    private int hotes;
    
    public Subnet(String name, int hotes) {
        this.name = name;
        this.hotes = hotes;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getAddresseReseau() {
        return addresseReseau;
    }
    
    public String getAddresseBroadcast() {
        return addresseBroadcast;
    }
    
    public String getPremAddUtilisable() {
        return premAddUtilisable;
    }
    
    public String getDernAddUtilisable() {
        return dernAddUtilisable;
    }
    
    public int getMasque() {
        return masque;
    }
    
    public int getHotes() {
        return hotes;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddresseReseau(String addresseReseau) {
        this.addresseReseau = addresseReseau;
    }
    
    public void setAddresseBroadcast(String addresseBroadcast) {
        this.addresseBroadcast = addresseBroadcast;
    }
    
    public void setPremAddUtilisable(String premAddUtilisable) {
        this.premAddUtilisable = premAddUtilisable;
    }
    
    public void setDernAddUtilisable(String dernAddUtilisable) {
        this.dernAddUtilisable = dernAddUtilisable;
    }
    
    public void setMasque(int masque) {
        this.masque = masque;
    }
    
    public void setHotes(int hotes) {
        this.hotes = hotes;
    }
    
    @Override
    public String toString() {
        return String.format("Subnet{name='%s', hotes=%d, addresseReseau='%s', masque=%d}", 
                           name, hotes, addresseReseau, masque);
    }
}