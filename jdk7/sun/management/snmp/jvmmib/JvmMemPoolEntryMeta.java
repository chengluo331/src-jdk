/*
 * Copyright (c) 2003, 2004, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package sun.management.snmp.jvmmib;

//
// Generated by mibgen version 5.0 (06/02/03) when compiling JVM-MANAGEMENT-MIB in standard metadata mode.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.jmx.snmp.SnmpCounter;
import com.sun.jmx.snmp.SnmpCounter64;
import com.sun.jmx.snmp.SnmpGauge;
import com.sun.jmx.snmp.SnmpInt;
import com.sun.jmx.snmp.SnmpUnsignedInt;
import com.sun.jmx.snmp.SnmpIpAddress;
import com.sun.jmx.snmp.SnmpTimeticks;
import com.sun.jmx.snmp.SnmpOpaque;
import com.sun.jmx.snmp.SnmpString;
import com.sun.jmx.snmp.SnmpStringFixed;
import com.sun.jmx.snmp.SnmpOid;
import com.sun.jmx.snmp.SnmpNull;
import com.sun.jmx.snmp.SnmpValue;
import com.sun.jmx.snmp.SnmpVarBind;
import com.sun.jmx.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.jmx.snmp.agent.SnmpMibNode;
import com.sun.jmx.snmp.agent.SnmpMib;
import com.sun.jmx.snmp.agent.SnmpMibEntry;
import com.sun.jmx.snmp.agent.SnmpStandardObjectServer;
import com.sun.jmx.snmp.agent.SnmpStandardMetaServer;
import com.sun.jmx.snmp.agent.SnmpMibSubRequest;
import com.sun.jmx.snmp.agent.SnmpMibTable;
import com.sun.jmx.snmp.EnumRowStatus;
import com.sun.jmx.snmp.SnmpDefinitions;

/**
 * The class is used for representing SNMP metadata for the "JvmMemPoolEntry" group.
 * The group is defined with the following oid: 1.3.6.1.4.1.42.2.145.3.163.1.1.2.110.1.
 */
public class JvmMemPoolEntryMeta extends SnmpMibEntry
     implements Serializable, SnmpStandardMetaServer {

    /**
     * Constructor for the metadata associated to "JvmMemPoolEntry".
     */
    public JvmMemPoolEntryMeta(SnmpMib myMib, SnmpStandardObjectServer objserv) {
        objectserver = objserv;
        varList = new int[20];
        varList[0] = 33;
        varList[1] = 32;
        varList[2] = 31;
        varList[3] = 133;
        varList[4] = 132;
        varList[5] = 131;
        varList[6] = 13;
        varList[7] = 12;
        varList[8] = 11;
        varList[9] = 10;
        varList[10] = 112;
        varList[11] = 111;
        varList[12] = 110;
        varList[13] = 5;
        varList[14] = 4;
        varList[15] = 3;
        varList[16] = 2;
        varList[17] = 23;
        varList[18] = 22;
        varList[19] = 21;
        SnmpMibNode.sort(varList);
    }

    /**
     * Get the value of a scalar variable
     */
    public SnmpValue get(long var, Object data)
        throws SnmpStatusException {
        switch((int)var) {
            case 33:
                return new SnmpCounter64(node.getJvmMemPoolCollectMaxSize());

            case 32:
                return new SnmpCounter64(node.getJvmMemPoolCollectCommitted());

            case 31:
                return new SnmpCounter64(node.getJvmMemPoolCollectUsed());

            case 133:
                return new SnmpInt(node.getJvmMemPoolCollectThreshdSupport());

            case 132:
                return new SnmpCounter64(node.getJvmMemPoolCollectThreshdCount());

            case 131:
                return new SnmpCounter64(node.getJvmMemPoolCollectThreshold());

            case 13:
                return new SnmpCounter64(node.getJvmMemPoolMaxSize());

            case 12:
                return new SnmpCounter64(node.getJvmMemPoolCommitted());

            case 11:
                return new SnmpCounter64(node.getJvmMemPoolUsed());

            case 10:
                return new SnmpCounter64(node.getJvmMemPoolInitSize());

            case 112:
                return new SnmpInt(node.getJvmMemPoolThreshdSupport());

            case 111:
                return new SnmpCounter64(node.getJvmMemPoolThreshdCount());

            case 110:
                return new SnmpCounter64(node.getJvmMemPoolThreshold());

            case 5:
                return new SnmpCounter64(node.getJvmMemPoolPeakReset());

            case 4:
                return new SnmpInt(node.getJvmMemPoolState());

            case 3:
                return new SnmpInt(node.getJvmMemPoolType());

            case 2:
                return new SnmpString(node.getJvmMemPoolName());

            case 23:
                return new SnmpCounter64(node.getJvmMemPoolPeakMaxSize());

            case 1:
                throw new SnmpStatusException(SnmpStatusException.noSuchInstance);
            case 22:
                return new SnmpCounter64(node.getJvmMemPoolPeakCommitted());

            case 21:
                return new SnmpCounter64(node.getJvmMemPoolPeakUsed());

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    /**
     * Set the value of a scalar variable
     */
    public SnmpValue set(SnmpValue x, long var, Object data)
        throws SnmpStatusException {
        switch((int)var) {
            case 33:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 32:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 31:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 133:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 132:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 131:
                if (x instanceof SnmpCounter64) {
                    node.setJvmMemPoolCollectThreshold(((SnmpCounter64)x).toLong());
                    return new SnmpCounter64(node.getJvmMemPoolCollectThreshold());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 13:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 12:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 11:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 10:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 112:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 111:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 110:
                if (x instanceof SnmpCounter64) {
                    node.setJvmMemPoolThreshold(((SnmpCounter64)x).toLong());
                    return new SnmpCounter64(node.getJvmMemPoolThreshold());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 5:
                if (x instanceof SnmpCounter64) {
                    node.setJvmMemPoolPeakReset(((SnmpCounter64)x).toLong());
                    return new SnmpCounter64(node.getJvmMemPoolPeakReset());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 4:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 3:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 2:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 23:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 1:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 22:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 21:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
    }

    /**
     * Check the value of a scalar variable
     */
    public void check(SnmpValue x, long var, Object data)
        throws SnmpStatusException {
        switch((int) var) {
            case 33:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 32:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 31:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 133:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 132:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 131:
                if (x instanceof SnmpCounter64) {
                    node.checkJvmMemPoolCollectThreshold(((SnmpCounter64)x).toLong());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 13:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 12:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 11:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 10:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 112:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 111:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 110:
                if (x instanceof SnmpCounter64) {
                    node.checkJvmMemPoolThreshold(((SnmpCounter64)x).toLong());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 5:
                if (x instanceof SnmpCounter64) {
                    node.checkJvmMemPoolPeakReset(((SnmpCounter64)x).toLong());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 4:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 3:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 2:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 23:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 1:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 22:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 21:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            default:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
        }
    }

    /**
     * Allow to bind the metadata description to a specific object.
     */
    protected void setInstance(JvmMemPoolEntryMBean var) {
        node = var;
    }


    // ------------------------------------------------------------
    //
    // Implements the "get" method defined in "SnmpMibEntry".
    // See the "SnmpMibEntry" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void get(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.get(this,req,depth);
    }


    // ------------------------------------------------------------
    //
    // Implements the "set" method defined in "SnmpMibEntry".
    // See the "SnmpMibEntry" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void set(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.set(this,req,depth);
    }


    // ------------------------------------------------------------
    //
    // Implements the "check" method defined in "SnmpMibEntry".
    // See the "SnmpMibEntry" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void check(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.check(this,req,depth);
    }

    /**
     * Returns true if "arc" identifies a scalar object.
     */
    public boolean isVariable(long arc) {

        switch((int)arc) {
            case 33:
            case 32:
            case 31:
            case 133:
            case 132:
            case 131:
            case 13:
            case 12:
            case 11:
            case 10:
            case 112:
            case 111:
            case 110:
            case 5:
            case 4:
            case 3:
            case 2:
            case 23:
            case 1:
            case 22:
            case 21:
                return true;
            default:
                break;
        }
        return false;
    }

    /**
     * Returns true if "arc" identifies a readable scalar object.
     */
    public boolean isReadable(long arc) {

        switch((int)arc) {
            case 33:
            case 32:
            case 31:
            case 133:
            case 132:
            case 131:
            case 13:
            case 12:
            case 11:
            case 10:
            case 112:
            case 111:
            case 110:
            case 5:
            case 4:
            case 3:
            case 2:
            case 23:
            case 22:
            case 21:
                return true;
            default:
                break;
        }
        return false;
    }


    // ------------------------------------------------------------
    //
    // Implements the "skipVariable" method defined in "SnmpMibEntry".
    // See the "SnmpMibEntry" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public boolean  skipVariable(long var, Object data, int pduVersion) {
        switch((int)var) {
            case 33:
            case 32:
            case 31:
            case 132:
            case 131:
            case 13:
            case 12:
            case 11:
            case 10:
            case 111:
            case 110:
            case 5:
            case 23:
                if (pduVersion==SnmpDefinitions.snmpVersionOne) return true;
                break;
            case 1:
                return true;
            case 22:
            case 21:
                if (pduVersion==SnmpDefinitions.snmpVersionOne) return true;
                break;
            default:
                break;
        }
        return super.skipVariable(var,data,pduVersion);
    }

    /**
     * Return the name of the attribute corresponding to the SNMP variable identified by "id".
     */
    public String getAttributeName(long id)
        throws SnmpStatusException {
        switch((int)id) {
            case 33:
                return "JvmMemPoolCollectMaxSize";

            case 32:
                return "JvmMemPoolCollectCommitted";

            case 31:
                return "JvmMemPoolCollectUsed";

            case 133:
                return "JvmMemPoolCollectThreshdSupport";

            case 132:
                return "JvmMemPoolCollectThreshdCount";

            case 131:
                return "JvmMemPoolCollectThreshold";

            case 13:
                return "JvmMemPoolMaxSize";

            case 12:
                return "JvmMemPoolCommitted";

            case 11:
                return "JvmMemPoolUsed";

            case 10:
                return "JvmMemPoolInitSize";

            case 112:
                return "JvmMemPoolThreshdSupport";

            case 111:
                return "JvmMemPoolThreshdCount";

            case 110:
                return "JvmMemPoolThreshold";

            case 5:
                return "JvmMemPoolPeakReset";

            case 4:
                return "JvmMemPoolState";

            case 3:
                return "JvmMemPoolType";

            case 2:
                return "JvmMemPoolName";

            case 23:
                return "JvmMemPoolPeakMaxSize";

            case 1:
                return "JvmMemPoolIndex";

            case 22:
                return "JvmMemPoolPeakCommitted";

            case 21:
                return "JvmMemPoolPeakUsed";

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    protected JvmMemPoolEntryMBean node;
    protected SnmpStandardObjectServer objectserver = null;
}
