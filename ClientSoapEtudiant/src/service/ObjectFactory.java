
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SupprimerEtudiants_QNAME = new QName("http://Service/", "SupprimerEtudiants");
    private final static QName _AjouterEtudiantsResponse_QNAME = new QName("http://Service/", "AjouterEtudiantsResponse");
    private final static QName _AjouterEtudiants_QNAME = new QName("http://Service/", "AjouterEtudiants");
    private final static QName _ListerEtudiantsResponse_QNAME = new QName("http://Service/", "ListerEtudiantsResponse");
    private final static QName _ListerEtudiants_QNAME = new QName("http://Service/", "ListerEtudiants");
    private final static QName _ModifierEtudiants_QNAME = new QName("http://Service/", "ModifierEtudiants");
    private final static QName _ModifierEtudiantsResponse_QNAME = new QName("http://Service/", "ModifierEtudiantsResponse");
    private final static QName _SupprimerEtudiantsResponse_QNAME = new QName("http://Service/", "SupprimerEtudiantsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifierEtudiants }
     * 
     */
    public ModifierEtudiants createModifierEtudiants() {
        return new ModifierEtudiants();
    }

    /**
     * Create an instance of {@link ModifierEtudiantsResponse }
     * 
     */
    public ModifierEtudiantsResponse createModifierEtudiantsResponse() {
        return new ModifierEtudiantsResponse();
    }

    /**
     * Create an instance of {@link SupprimerEtudiantsResponse }
     * 
     */
    public SupprimerEtudiantsResponse createSupprimerEtudiantsResponse() {
        return new SupprimerEtudiantsResponse();
    }

    /**
     * Create an instance of {@link SupprimerEtudiants }
     * 
     */
    public SupprimerEtudiants createSupprimerEtudiants() {
        return new SupprimerEtudiants();
    }

    /**
     * Create an instance of {@link AjouterEtudiantsResponse }
     * 
     */
    public AjouterEtudiantsResponse createAjouterEtudiantsResponse() {
        return new AjouterEtudiantsResponse();
    }

    /**
     * Create an instance of {@link ListerEtudiants }
     * 
     */
    public ListerEtudiants createListerEtudiants() {
        return new ListerEtudiants();
    }

    /**
     * Create an instance of {@link AjouterEtudiants }
     * 
     */
    public AjouterEtudiants createAjouterEtudiants() {
        return new AjouterEtudiants();
    }

    /**
     * Create an instance of {@link ListerEtudiantsResponse }
     * 
     */
    public ListerEtudiantsResponse createListerEtudiantsResponse() {
        return new ListerEtudiantsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "SupprimerEtudiants")
    public JAXBElement<SupprimerEtudiants> createSupprimerEtudiants(SupprimerEtudiants value) {
        return new JAXBElement<SupprimerEtudiants>(_SupprimerEtudiants_QNAME, SupprimerEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "AjouterEtudiantsResponse")
    public JAXBElement<AjouterEtudiantsResponse> createAjouterEtudiantsResponse(AjouterEtudiantsResponse value) {
        return new JAXBElement<AjouterEtudiantsResponse>(_AjouterEtudiantsResponse_QNAME, AjouterEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "AjouterEtudiants")
    public JAXBElement<AjouterEtudiants> createAjouterEtudiants(AjouterEtudiants value) {
        return new JAXBElement<AjouterEtudiants>(_AjouterEtudiants_QNAME, AjouterEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ListerEtudiantsResponse")
    public JAXBElement<ListerEtudiantsResponse> createListerEtudiantsResponse(ListerEtudiantsResponse value) {
        return new JAXBElement<ListerEtudiantsResponse>(_ListerEtudiantsResponse_QNAME, ListerEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ListerEtudiants")
    public JAXBElement<ListerEtudiants> createListerEtudiants(ListerEtudiants value) {
        return new JAXBElement<ListerEtudiants>(_ListerEtudiants_QNAME, ListerEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ModifierEtudiants")
    public JAXBElement<ModifierEtudiants> createModifierEtudiants(ModifierEtudiants value) {
        return new JAXBElement<ModifierEtudiants>(_ModifierEtudiants_QNAME, ModifierEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ModifierEtudiantsResponse")
    public JAXBElement<ModifierEtudiantsResponse> createModifierEtudiantsResponse(ModifierEtudiantsResponse value) {
        return new JAXBElement<ModifierEtudiantsResponse>(_ModifierEtudiantsResponse_QNAME, ModifierEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "SupprimerEtudiantsResponse")
    public JAXBElement<SupprimerEtudiantsResponse> createSupprimerEtudiantsResponse(SupprimerEtudiantsResponse value) {
        return new JAXBElement<SupprimerEtudiantsResponse>(_SupprimerEtudiantsResponse_QNAME, SupprimerEtudiantsResponse.class, null, value);
    }

}
