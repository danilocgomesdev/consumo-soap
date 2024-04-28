package br.gov.caixa.sibar.sistemafieg.service.ssl;

import org.apache.axis.components.logger.LogFactory;
import org.apache.axis.utils.Messages;
import org.apache.commons.logging.Log;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class FakeX509TrustManager implements X509TrustManager {

    protected static Log log;

    static {
        log = LogFactory.getLog("log ");
    }

    public FakeX509TrustManager() {
    }

    public boolean isClientTrusted(X509Certificate[] chain) {
        if (log.isDebugEnabled()) {
            log.debug(Messages.getMessage("ftsf03"));
        }

        return true;
    }

    public boolean isServerTrusted(X509Certificate[] chain) {
        if (log.isDebugEnabled()) {
            log.debug(Messages.getMessage("ftsf04"));
        }

        return true;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s)
            throws CertificateException {
        if (log.isDebugEnabled()) {
            log.debug(Messages.getMessage("ftsf03"));
        }

    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s)
            throws CertificateException {
        if (log.isDebugEnabled()) {
            log.debug(Messages.getMessage("ftsf04"));
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        if (log.isDebugEnabled()) {
            log.debug(Messages.getMessage("ftsf05"));
        }

        return null;
    }
}
