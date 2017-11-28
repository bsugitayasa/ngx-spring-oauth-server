/**
 * 
 */
package com.balicamp.ngx.master.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="mailto:bagus.sugitayasa@sigma.co.id">GusdeGita</a>
 * @version Id: 
 */
@Data
@NoArgsConstructor
public class Foo {
	private long id;
    private String name;
    
    public Foo(final long id, final String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
