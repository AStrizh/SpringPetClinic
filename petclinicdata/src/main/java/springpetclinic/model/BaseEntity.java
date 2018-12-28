package springpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 7852609173690610905L;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
