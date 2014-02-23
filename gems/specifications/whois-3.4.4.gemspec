# -*- encoding: utf-8 -*-
# stub: whois 3.4.4 ruby lib

Gem::Specification.new do |s|
  s.name = "whois"
  s.version = "3.4.4"

  s.required_rubygems_version = Gem::Requirement.new(">= 0") if s.respond_to? :required_rubygems_version=
  s.authors = ["Simone Carletti"]
  s.date = "2014-01-31"
  s.description = "Whois is an intelligent WHOIS client and parser written in pure Ruby. It can query registry data for IPv4, IPv6 and top level domains, parse and convert responses into easy-to-use Ruby objects."
  s.email = ["weppos@weppos.net"]
  s.executables = ["ruby-whois"]
  s.files = ["bin/ruby-whois"]
  s.homepage = "http://www.ruby-whois.org/"
  s.licenses = ["MIT"]
  s.post_install_message = "********************************************************************************\n\n  Thank you for installing the whois gem!\n\n  If you like this gem, please support the project.\n  http://pledgie.com/campaigns/11383\n\n  Does your project or organization use this gem? Add it to the apps wiki.\n  https://github.com/weppos/whois/wiki/apps\n\n  Are you looking for a quick and convenient way to perform WHOIS queries?\n  Check out RoboWhois WHOIS API.\n  https://www.robowhois.com/\n\n********************************************************************************\n"
  s.require_paths = ["lib"]
  s.required_ruby_version = Gem::Requirement.new(">= 1.9.2")
  s.rubyforge_project = "whois"
  s.rubygems_version = "2.1.9"
  s.summary = "An intelligent pure Ruby WHOIS client and parser."

  if s.respond_to? :specification_version then
    s.specification_version = 4

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
      s.add_development_dependency(%q<rake>, [">= 0"])
      s.add_development_dependency(%q<rspec>, [">= 0"])
      s.add_development_dependency(%q<mocha>, [">= 0"])
      s.add_development_dependency(%q<yard>, [">= 0"])
    else
      s.add_dependency(%q<rake>, [">= 0"])
      s.add_dependency(%q<rspec>, [">= 0"])
      s.add_dependency(%q<mocha>, [">= 0"])
      s.add_dependency(%q<yard>, [">= 0"])
    end
  else
    s.add_dependency(%q<rake>, [">= 0"])
    s.add_dependency(%q<rspec>, [">= 0"])
    s.add_dependency(%q<mocha>, [">= 0"])
    s.add_dependency(%q<yard>, [">= 0"])
  end
end
