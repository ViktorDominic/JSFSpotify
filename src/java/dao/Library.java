/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "library")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Library.findAll", query = "SELECT u FROM Library u"),
    @NamedQuery(name = "Library.findById", query = "SELECT u FROM Library u WHERE u.id = :id"),
    @NamedQuery(name = "Library.findByPlaylists", query = "SELECT u FROM Library u WHERE u.playlists = :playlists"),
    @NamedQuery(name = "Library.findByArtist", query = "SELECT u FROM Library u WHERE u.artist = :artist"),
    @NamedQuery(name = "Library.findByDownloaded", query = "SELECT u FROM Library u WHERE u.downloaded = :downloaded"),
    @NamedQuery(name = "Library.findByAlbum", query = "SELECT u FROM Library u WHERE u.album = :album")})

//id, playlist, artista download e album 
public class Library implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "playlists")
    private String playlists;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "artist")
    private String artist;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "downloaded")
    private String downloaded;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "album")
    private String album;
    
        public Library() {
    }

    public Library(Long id) {
        this.id = id;
    }
    
    public Library (Long id, String playlists, String album, String downloaded, String artist ) { 
        this.id = id; 
        this.playlists = playlists;
        this.album = album;
        this.downloaded = downloaded;
        this.artist = artist; 
    }
///////////////////////////////////////////////////////////////////////////////

    public String getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(String downloaded) {
        this.downloaded = downloaded;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaylists() {
        return playlists;
    }

    public void setPlaylists(String playlists) {
        this.playlists = playlists;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Library)) {
            return false;
        }
        Library other = (Library) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Library[ id=" + id + " ]";
    }

}
