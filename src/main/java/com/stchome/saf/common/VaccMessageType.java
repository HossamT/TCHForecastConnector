
/**
 * VaccMessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.stchome.saf.common;
            

            /**
            *  VaccMessageType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class VaccMessageType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = VaccMessageType
                Namespace URI = http://saf.stchome.com/common
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Message
                        */

                        
                                    protected com.stchome.saf.common.Len500StringType localMessage ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.stchome.saf.common.Len500StringType
                           */
                           public  com.stchome.saf.common.Len500StringType getMessage(){
                               return localMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Message
                               */
                               public void setMessage(com.stchome.saf.common.Len500StringType param){
                            
                                            this.localMessage=param;
                                    

                               }
                            

                        /**
                        * field for MessageType
                        * This was an Attribute!
                        */

                        
                                    protected com.stchome.saf.common.MessageTypes localMessageType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.stchome.saf.common.MessageTypes
                           */
                           public  com.stchome.saf.common.MessageTypes getMessageType(){
                               return localMessageType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessageType
                               */
                               public void setMessageType(com.stchome.saf.common.MessageTypes param){
                            
                                            this.localMessageType=param;
                                    

                               }
                            

                        /**
                        * field for FamilyCode
                        * This was an Attribute!
                        */

                        
                                    protected java.math.BigInteger localFamilyCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getFamilyCode(){
                               return localFamilyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FamilyCode
                               */
                               public void setFamilyCode(java.math.BigInteger param){
                            
                                            this.localFamilyCode=param;
                                    

                               }
                            

                        /**
                        * field for DoseNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.math.BigInteger localDoseNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getDoseNumber(){
                               return localDoseNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoseNumber
                               */
                               public void setDoseNumber(java.math.BigInteger param){
                            
                                            this.localDoseNumber=param;
                                    

                               }
                            

                        /**
                        * field for SeriesComplete
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSeriesComplete ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeriesComplete(){
                               return localSeriesComplete;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeriesComplete
                               */
                               public void setSeriesComplete(java.lang.String param){
                            
                                            this.localSeriesComplete=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://saf.stchome.com/common");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":VaccMessageType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "VaccMessageType",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localMessageType != null){
                                        writeAttribute("",
                                           "messageType",
                                           localMessageType.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localMessageType is null");
                                      }
                                    
                                            if (localFamilyCode != null){
                                        
                                                writeAttribute("",
                                                         "familyCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFamilyCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localDoseNumber != null){
                                        
                                                writeAttribute("",
                                                         "doseNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoseNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localSeriesComplete != null){
                                        
                                                writeAttribute("",
                                                         "seriesComplete",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeriesComplete), xmlWriter);

                                            
                                      }
                                    
                                            if (localMessage==null){
                                                 throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");
                                            }
                                           localMessage.serialize(new javax.xml.namespace.QName("http://saf.stchome.com/common","message"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://saf.stchome.com/common")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("http://saf.stchome.com/common",
                                                                      "message"));
                            
                            
                                    if (localMessage==null){
                                         throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");
                                    }
                                    elementList.add(localMessage);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","messageType"));
                            
                                      attribList.add(localMessageType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","familyCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFamilyCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","doseNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoseNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","seriesComplete"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeriesComplete));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static VaccMessageType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            VaccMessageType object =
                new VaccMessageType();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"VaccMessageType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (VaccMessageType)com.stchome.saf.messages.get._1_2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "messageType"
                    java.lang.String tempAttribMessageType =
                        
                                reader.getAttributeValue(null,"messageType");
                            
                   if (tempAttribMessageType!=null){
                         java.lang.String content = tempAttribMessageType;
                        
                                                  object.setMessageType(
                                                        com.stchome.saf.common.MessageTypes.Factory.fromString(reader,tempAttribMessageType));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute messageType is missing");
                           
                    }
                    handledAttributes.add("messageType");
                    
                    // handle attribute "familyCode"
                    java.lang.String tempAttribFamilyCode =
                        
                                reader.getAttributeValue(null,"familyCode");
                            
                   if (tempAttribFamilyCode!=null){
                         java.lang.String content = tempAttribFamilyCode;
                        
                                                 object.setFamilyCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(tempAttribFamilyCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("familyCode");
                    
                    // handle attribute "doseNumber"
                    java.lang.String tempAttribDoseNumber =
                        
                                reader.getAttributeValue(null,"doseNumber");
                            
                   if (tempAttribDoseNumber!=null){
                         java.lang.String content = tempAttribDoseNumber;
                        
                                                 object.setDoseNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(tempAttribDoseNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("doseNumber");
                    
                    // handle attribute "seriesComplete"
                    java.lang.String tempAttribSeriesComplete =
                        
                                reader.getAttributeValue(null,"seriesComplete");
                            
                   if (tempAttribSeriesComplete!=null){
                         java.lang.String content = tempAttribSeriesComplete;
                        
                                                 object.setSeriesComplete(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSeriesComplete));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("seriesComplete");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://saf.stchome.com/common","message").equals(reader.getName())){
                                
                                                object.setMessage(com.stchome.saf.common.Len500StringType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    