package od.repository;

import od.model.ContextMapping;

public interface ContextMappingRepositoryInterface {
    ContextMapping findOne(final String key);
    ContextMapping findByKeyAndContext(final String key, final String context);
    ContextMapping save(final ContextMapping contextMapping);
}
