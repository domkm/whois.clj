# WHOIS

A Clojure wrapper for the [(J)Ruby Whois gem](ruby-whois.org)


## Usage [![Current Version](https://clojars.org/com.domkm/whois/latest-version.svg)](https://clojars.org/com.domkm/whois)

```clojure
(ns domain.bot
  (:require [domkm.whois :refer [whois]]))

(whois "clojure.org")

{:parts
 [{:body
   "Domain Name:CLOJURE.ORG\r\nDomain ID: D106007872-LROR\r\nCreation Date: 2005-04-03T14:24:30Z\r\nUpdated Date: 2013-02-27T15:19:02Z\r\nRegistry Expiry Date: 2014-04-03T14:24:30Z\r\nSponsoring Registrar:Register.com, Inc. (R71-LROR)\r\nSponsoring Registrar IANA ID: 9\r\nWHOIS Server: \r\nReferral URL: \r\nDomain Status: clientTransferProhibited\r\nRegistrant ID:7124109feeed4031\r\nRegistrant Name:Domain Discreet Privacy Service\r\nRegistrant Organization:ATTN: clojure.org\r\nRegistrant Street: 12808 Gran Bay Pkwy\r\nRegistrant City:West Jacksonville\r\nRegistrant State/Province:FL\r\nRegistrant Postal Code:32258\r\nRegistrant Country:US\r\nRegistrant Phone:+1.9027492701\r\nRegistrant Phone Ext: \r\nRegistrant Fax: \r\nRegistrant Fax Ext: \r\nRegistrant Email:cb3e154c0a16121f4e8ab898a95866d9@domaindiscreet.com\r\nAdmin ID:9738194fee81c133\r\nAdmin Name:Domain Discreet Privacy Service\r\nAdmin Organization:ATTN: clojure.org\r\nAdmin Street: 12808 Gran Bay Pkwy\r\nAdmin City:West Jacksonville\r\nAdmin State/Province:FL\r\nAdmin Postal Code:32258\r\nAdmin Country:US\r\nAdmin Phone:+1.9027492701\r\nAdmin Phone Ext: \r\nAdmin Fax: \r\nAdmin Fax Ext: \r\nAdmin Email:cb3e154a0a16121f50a9d2a97b115fc4@domaindiscreet.com\r\nTech ID:4483816fef320347\r\nTech Name:Domain Discreet Privacy Service\r\nTech Organization:ATTN: clojure.org\r\nTech Street: 12808 Gran Bay Pkwy\r\nTech City:West Jacksonville\r\nTech State/Province:FL\r\nTech Postal Code:32258\r\nTech Country:US\r\nTech Phone:+1.9027492701\r\nTech Phone Ext: \r\nTech Fax: \r\nTech Fax Ext: \r\nTech Email:cb3e154e0a16121f2be8896b031ee853@domaindiscreet.com\r\nName Server:NS1170.DNS.DYN.COM\r\nName Server:NS4177.DNS.DYN.COM\r\nName Server:NS3137.DNS.DYN.COM\r\nName Server:NS2138.DNS.DYN.COM\r\nName Server: \r\nName Server: \r\nName Server: \r\nName Server: \r\nName Server: \r\nName Server: \r\nName Server: \r\nName Server: \r\nName Server: \r\nDNSSEC:Unsigned\r\n\r\nAccess to .ORG WHOIS information is provided to assist persons in determining the contents of a domain name registration record in the Public Interest Registry registry database. The data in this record is provided by Public Interest Registry for informational purposes only, and Public Interest Registry does not guarantee its accuracy. This service is intended only for query-based access. You agree that you will use this data only for lawful purposes and that, under no circumstances will you use this data to(a) allow, enable, or otherwise support the transmission by e-mail, telephone, or facsimile of mass unsolicited, commercial advertising or solicitations to entities other than the data recipient's own existing customers; or (b) enable high volume, automated, electronic processes that send queries or data to the systems of Registry Operator, a Registrar, or Afilias except as reasonably necessary to register domain names or modify existing registrations. All rights reserved. Public Interest Registry reserves the right to modify these terms at any time. By submitting this query, you agree to abide by this policy.\n\n\n",
   :host "whois.pir.org"}],
 :properties
 {:nameservers
  [{:name "ns1170.dns.dyn.com", :ipv4 nil, :ipv6 nil}
   {:name "ns4177.dns.dyn.com", :ipv4 nil, :ipv6 nil}
   {:name "ns3137.dns.dyn.com", :ipv4 nil, :ipv6 nil}
   {:name "ns2138.dns.dyn.com", :ipv4 nil, :ipv6 nil}],
  :status ["clientTransferProhibited"],
  :created_on #inst "2005-04-03T14:24:30.000-00:00",
  :available? false,
  :admin_contacts
  [{:country nil,
    :created_on nil,
    :state "FL",
    :name "Domain Discreet Privacy Service",
    :updated_on nil,
    :organization "ATTN: clojure.org",
    :city "West Jacksonville",
    :phone "+1.9027492701",
    :url nil,
    :email "cb3e154a0a16121f50a9d2a97b115fc4@domaindiscreet.com",
    :type 2,
    :fax "",
    :country_code "US",
    :zip "32258",
    :address "12808 Gran Bay Pkwy",
    :id "9738194fee81c133"}],
  :domain "clojure.org",
  :updated_on #inst "2013-02-27T15:19:02.000-00:00",
  :registrant_contacts
  [{:country nil,
    :created_on nil,
    :state "FL",
    :name "Domain Discreet Privacy Service",
    :updated_on nil,
    :organization "ATTN: clojure.org",
    :city "West Jacksonville",
    :phone "+1.9027492701",
    :url nil,
    :email "cb3e154c0a16121f4e8ab898a95866d9@domaindiscreet.com",
    :type 1,
    :fax "",
    :country_code "US",
    :zip "32258",
    :address "12808 Gran Bay Pkwy",
    :id "7124109feeed4031"}],
  :registrar
  {:id "9",
   :name "Register.com, Inc. (R71-LROR)",
   :organization "Register.com, Inc. (R71-LROR)",
   :url nil},
  :domain_id "D106007872-LROR",
  :expires_on #inst "2014-04-03T14:24:30.000-00:00",
  :technical_contacts
  [{:country nil,
    :created_on nil,
    :state "FL",
    :name "Domain Discreet Privacy Service",
    :updated_on nil,
    :organization "ATTN: clojure.org",
    :city "West Jacksonville",
    :phone "+1.9027492701",
    :url nil,
    :email "cb3e154e0a16121f2be8896b031ee853@domaindiscreet.com",
    :type 3,
    :fax "",
    :country_code "US",
    :zip "32258",
    :address "12808 Gran Bay Pkwy",
    :id "4483816fef320347"}],
  :disclaimer
  "Access to .ORG WHOIS information is provided to assist persons in determining the contents of a domain name registration record in the Public Interest Registry registry database. The data in this record is provided by Public Interest Registry for informational purposes only, and Public Interest Registry does not guarantee its accuracy. This service is intended only for query-based access. You agree that you will use this data only for lawful purposes and that, under no circumstances will you use this data to(a) allow, enable, or otherwise support the transmission by e-mail, telephone, or facsimile of mass unsolicited, commercial advertising or solicitations to entities other than the data recipient's own existing customers; or (b) enable high volume, automated, electronic processes that send queries or data to the systems of Registry Operator, a Registrar, or Afilias except as reasonably necessary to register domain names or modify existing registrations. All rights reserved. Public Interest Registry reserves the right to modify these terms at any time. By submitting this query, you agree to abide by this policy.",
  :registered? true}}
```

## License

Copyright © 2014 Dom Kiva-Meyer

Distributed under the Eclipse Public License version 1.0.
