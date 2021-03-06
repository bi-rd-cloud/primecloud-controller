/*
 * Copyright 2014 by SCSK Corporation.
 * 
 * This file is part of PrimeCloud Controller(TM).
 * 
 * PrimeCloud Controller(TM) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * PrimeCloud Controller(TM) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with PrimeCloud Controller(TM). If not, see <http://www.gnu.org/licenses/>.
 */
package jp.primecloud.auto.entity.crud;

import java.io.Serializable;

/**
 * <p>
 * aws_load_balancerに対応したエンティティのベースクラスです。
 * </p>
 *
 */
public abstract class BaseAwsLoadBalancer implements Serializable {

    /** SerialVersionUID */
    private static final long serialVersionUID = 1L;

    /** LOAD_BALANCER_NO [BIGINT(19,0)] */
    private Long loadBalancerNo;

    /** NAME [VARCHAR(30,0)] */
    private String name;

    /** DNS_NAME [VARCHAR(100,0)] */
    private String dnsName;

    /** SUBNET_ID [VARCHAR(100,0)] */
    private String subnetId;

    /** SECURITY_GROUPS [VARCHAR(100,0)] */
    private String securityGroups;

    /** AVAILABILITY_ZONE [VARCHAR(100,0)] */
    private String availabilityZone;

    /** HOSTID [VARCHAR(20,0)] */
    private String hostid;

    /** STATUS [VARCHAR(20,0)] */
    private String status;

    /**
     * loadBalancerNoを取得します。
     *
     * @return loadBalancerNo
     */
    public Long getLoadBalancerNo() {
        return loadBalancerNo;
    }

    /**
     * loadBalancerNoを設定します。
     *
     * @param loadBalancerNo loadBalancerNo
     */
    public void setLoadBalancerNo(Long loadBalancerNo) {
        this.loadBalancerNo = loadBalancerNo;
    }

    /**
     * nameを取得します。
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * nameを設定します。
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * dnsNameを取得します。
     *
     * @return dnsName
     */
    public String getDnsName() {
        return dnsName;
    }

    /**
     * dnsNameを設定します。
     *
     * @param dnsName dnsName
     */
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * subnetIdを取得します。
     *
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * subnetIdを設定します。
     *
     * @param subnetId subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * securityGroupsを取得します。
     *
     * @return securityGroups
     */
    public String getSecurityGroups() {
        return securityGroups;
    }

    /**
     * securityGroupsを設定します。
     *
     * @param securityGroups securityGroups
     */
    public void setSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
    }

    /**
     * availabilityZoneを取得します。
     *
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * availabilityZoneを設定します。
     *
     * @param availabilityZone availabilityZone
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * hostidを取得します。
     *
     * @return hostid
     */
    public String getHostid() {
        return hostid;
    }

    /**
     * hostidを設定します。
     *
     * @param hostid hostid
     */
    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    /**
     * statusを取得します。
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * statusを設定します。
     *
     * @param status status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int result = 1;

        final int prime = 31;
        result = prime * result + ((loadBalancerNo == null) ? 0 : loadBalancerNo.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((dnsName == null) ? 0 : dnsName.hashCode());
        result = prime * result + ((subnetId == null) ? 0 : subnetId.hashCode());
        result = prime * result + ((securityGroups == null) ? 0 : securityGroups.hashCode());
        result = prime * result + ((availabilityZone == null) ? 0 : availabilityZone.hashCode());
        result = prime * result + ((hostid == null) ? 0 : hostid.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }

        final BaseAwsLoadBalancer other = (BaseAwsLoadBalancer) obj;
        if (loadBalancerNo == null) {
            if (other.loadBalancerNo != null) { return false; }
        } else if (!loadBalancerNo.equals(other.loadBalancerNo)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) { return false; }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (dnsName == null) {
            if (other.dnsName != null) { return false; }
        } else if (!dnsName.equals(other.dnsName)) {
            return false;
        }
        if (subnetId == null) {
            if (other.subnetId != null) { return false; }
        } else if (!subnetId.equals(other.subnetId)) {
            return false;
        }
        if (securityGroups == null) {
            if (other.securityGroups != null) { return false; }
        } else if (!securityGroups.equals(other.securityGroups)) {
            return false;
        }
        if (availabilityZone == null) {
            if (other.availabilityZone != null) { return false; }
        } else if (!availabilityZone.equals(other.availabilityZone)) {
            return false;
        }
        if (hostid == null) {
            if (other.hostid != null) { return false; }
        } else if (!hostid.equals(other.hostid)) {
            return false;
        }
        if (status == null) {
            if (other.status != null) { return false; }
        } else if (!status.equals(other.status)) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("AwsLoadBalancer").append(" [");
        sb.append("loadBalancerNo=").append(loadBalancerNo).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("dnsName=").append(dnsName).append(", ");
        sb.append("subnetId=").append(subnetId).append(", ");
        sb.append("securityGroups=").append(securityGroups).append(", ");
        sb.append("availabilityZone=").append(availabilityZone).append(", ");
        sb.append("hostid=").append(hostid).append(", ");
        sb.append("status=").append(status);
        sb.append("]");
        return sb.toString();
    }

}
