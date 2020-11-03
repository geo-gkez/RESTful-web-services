package org.example.model;


import java.util.Date;


public class Order {

    private Integer id;

    private Date createdAt;
    private boolean espresso_classic;
    private boolean espresso_arabica;
    private boolean espresso_decaf;
    private boolean milk;
    private boolean soy;
    private boolean caramel_syrop;
    private boolean almond_milk;


    public Order() {
    }

    public Order(Integer id, Date createdAt, boolean espresso_classic, boolean espresso_arabica, boolean espresso_decaf, boolean milk, boolean soy, boolean caramel_syrop, boolean almond_milk) {
        this.id = id;
        this.createdAt = createdAt;
        this.espresso_classic = espresso_classic;
        this.espresso_arabica = espresso_arabica;
        this.espresso_decaf = espresso_decaf;
        this.milk = milk;
        this.soy = soy;
        this.caramel_syrop = caramel_syrop;
        this.almond_milk = almond_milk;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isEspresso_classic() {
        return espresso_classic;
    }

    public void setEspresso_classic(boolean espresso_classic) {
        this.espresso_classic = espresso_classic;
    }

    public boolean isEspresso_arabica() {
        return espresso_arabica;
    }

    public void setEspresso_arabica(boolean espresso_arabica) {
        this.espresso_arabica = espresso_arabica;
    }

    public boolean isEspresso_decaf() {
        return espresso_decaf;
    }

    public void setEspresso_decaf(boolean espresso_decaf) {
        this.espresso_decaf = espresso_decaf;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isCaramel_syrop() {
        return caramel_syrop;
    }

    public void setCaramel_syrop(boolean caramel_syrop) {
        this.caramel_syrop = caramel_syrop;
    }

    public boolean isAlmond_milk() {
        return almond_milk;
    }

    public void setAlmond_milk(boolean almond_milk) {
        this.almond_milk = almond_milk;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (espresso_classic != order.espresso_classic) return false;
        if (espresso_arabica != order.espresso_arabica) return false;
        if (espresso_decaf != order.espresso_decaf) return false;
        if (milk != order.milk) return false;
        if (soy != order.soy) return false;
        if (caramel_syrop != order.caramel_syrop) return false;
        if (almond_milk != order.almond_milk) return false;
        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        return createdAt != null ? createdAt.equals(order.createdAt) : order.createdAt == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (espresso_classic ? 1 : 0);
        result = 31 * result + (espresso_arabica ? 1 : 0);
        result = 31 * result + (espresso_decaf ? 1 : 0);
        result = 31 * result + (milk ? 1 : 0);
        result = 31 * result + (soy ? 1 : 0);
        result = 31 * result + (caramel_syrop ? 1 : 0);
        result = 31 * result + (almond_milk ? 1 : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", espresso_classic=" + espresso_classic +
                ", espresso_arabica=" + espresso_arabica +
                ", espresso_decaf=" + espresso_decaf +
                ", milk=" + milk +
                ", soy=" + soy +
                ", caramel_syrop=" + caramel_syrop +
                ", almond_milk=" + almond_milk +
                '}';
    }
}
