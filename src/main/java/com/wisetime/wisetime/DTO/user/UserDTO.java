package com.wisetime.wisetime.DTO.user;

public class UserDTO {
    private Long id;
    private String name;
    // Adicione outros campos que você precisa

    public UserDTO() {}

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
