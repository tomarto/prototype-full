package com.actions.prototype.graph.jaxb

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAttribute

@XmlAccessorType(XmlAccessType.FIELD)
class TimbreFiscalDigital {

    @XmlAttribute(name = 'UUID')
    String uuid

    @XmlAttribute(name = 'FechaTimbrado')
    String fechaTimbrado

    @XmlAttribute
    String selloCFD

    @XmlAttribute(name = 'noCertificadoSAT')
    String numeroCertificadoSAT

    @XmlAttribute
    String selloSAT
}