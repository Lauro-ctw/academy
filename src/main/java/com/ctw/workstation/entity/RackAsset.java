package com.ctw.workstation.entity;

//import com.ctw.workstation.booking.entity.Booking;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "T_RACK_ASSET")
public class RackAsset {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rackAssetIdGenerator")
    //@SequenceGenerator(name = "rackAssetIdGenerator", sequenceName = "SEQ_RACK_ASSET_ID")
    private UUID id;
    @Column(name = "ASSET_TAG")
    public String assetTag;
    @Column(name = "RACK_ID")
    public UUID rackId;
    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "RACK_ID", updatable = false, insertable = false, nullable = false)
    public Rack rack;
    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    public LocalDate createdAt;
    @Temporal(TemporalType.DATE)
    @Column(name = "modified_at")
    public LocalDate modifiedAt;

    /*

    private RackAsset(Long id, String assetTag, Long rackId, Rack rack){
        this.id = id;
        this.assetTag = assetTag;
        this.rackId = rackId;
        this.rack = rack;
    }

     */

    public RackAsset() {

    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAssetTag() {
        return assetTag;
    }

    public void setAssetTag(String assetTag) {
        this.assetTag = assetTag;
    }

    public UUID getRackId() {
        return rackId;
    }

    public void setRackId(UUID rackId) {
        this.rackId = rackId;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /*

    public static class Builder {
        private Long id;
        private String assetTag;
        private Long rackId;
        private Rack rack;

        public Builder(Long id, String assetTag, Long rackId, Rack rack) {
            this.id = id;
            this.assetTag = assetTag;
            this.rackId = rackId;
            this.rack = rack;
        }
        public RackAsset build() {
            return new RackAsset(id, assetTag, rackId, rack);
        }
    }

     */
}
