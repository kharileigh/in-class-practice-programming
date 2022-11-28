/**
 *
 * @author kharileigh
 */
package com.kharileigh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
        
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Dvd")
public class Dvd {
    
    @Id
    @Column(name = "DVD_ID")
    private int dvdId;
    
    @Column(name = "TITLE")
    private String title;
    
    @Column(name = "RELEASE_DATE")
    private String releaseDate;
    
    @Column(name = "DIRECTOR")
    private String director;
    
    @Column(name = "STUDIO")
    private String studio;
}
