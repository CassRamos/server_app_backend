package io.cass.server_management.service;

import io.cass.server_management.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);

    Server ping(String ipAddress) throws IOException;

    Collection<Server> list(int limit); //avoids fetching a large amount data

    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);

}
